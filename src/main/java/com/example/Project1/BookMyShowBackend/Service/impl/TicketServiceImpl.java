package com.example.Project1.BookMyShowBackend.Service.impl;

import com.example.Project1.BookMyShowBackend.Model.ShowEntity;
import com.example.Project1.BookMyShowBackend.Model.ShowSeatsEntity;
import com.example.Project1.BookMyShowBackend.Model.TicketEntity;
import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import com.example.Project1.BookMyShowBackend.Repository.ShowRepository;
import com.example.Project1.BookMyShowBackend.Repository.ShowSeatsRepository;
import com.example.Project1.BookMyShowBackend.Repository.TicketRepository;
import com.example.Project1.BookMyShowBackend.Repository.UserRepository;
import com.example.Project1.BookMyShowBackend.Service.TicketService;
import com.example.Project1.BookMyShowBackend.converter.TicketConvertor;
import com.example.Project1.BookMyShowBackend.dto.BookTicketRequestDto;
import com.example.Project1.BookMyShowBackend.dto.TicketDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TicketServiceImpl implements TicketService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    ShowRepository showRepository;
    @Override
    public TicketDto getTicket(int id) {
        return null;
    }

    @Override
    public TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto) {

        UserEntity user=userRepository.findById(bookTicketRequestDto.getId()).get();
        ShowEntity show=showRepository.findById(bookTicketRequestDto.getShowId()).get();
        Set<String> requestedSeats= bookTicketRequestDto.getRequestedSeats();
        List<ShowSeatsEntity> showSeatsEntityList=  show.getSeats();

        List<ShowSeatsEntity> bookedSeats= showSeatsEntityList.stream().
                filter(seat -> seat.getSeatType().equals(bookTicketRequestDto.getSeatType())
                        && !seat.isBooked() && requestedSeats.contains(seat.getSeatNumber())).collect(Collectors.toList());
        if(bookedSeats.size()!=requestedSeats.size()){
            throw new Error("Desired Seats are not available");
        }

        TicketEntity ticketEntity= TicketEntity.builder().user(user).show(show).seats(bookedSeats).build();
        double amount=0;
        for(ShowSeatsEntity showSeats:bookedSeats){
            showSeats.setBooked(true);
            showSeats.setBookedAt(new Date());
            showSeats.setTicket(ticketEntity);
            amount = amount +showSeats.getRate();
        }

        ticketEntity.setAllottedSeats(String.valueOf(bookedSeats));
        ticketEntity.setAmount(amount);

        //connect in the show and
        //showEntity.setTickets()
        //userEntity.setTicket()
        ticketEntity=ticketRepository.save(ticketEntity);
        return TicketConvertor.convertEntityToDto(ticketEntity);

    }
}
