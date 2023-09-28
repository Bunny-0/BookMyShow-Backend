package com.example.Project1.BookMyShowBackend.Service.impl;

import com.example.Project1.BookMyShowBackend.Enum.SeatType;
import com.example.Project1.BookMyShowBackend.Model.TheaterEntity;
import com.example.Project1.BookMyShowBackend.Model.TheaterSeatsEntity;
import com.example.Project1.BookMyShowBackend.Repository.TheaterRepository;
import com.example.Project1.BookMyShowBackend.Repository.TheaterSeatsRepository;
import com.example.Project1.BookMyShowBackend.Service.TheaterService;
import com.example.Project1.BookMyShowBackend.converter.TheaterConvertor;
import com.example.Project1.BookMyShowBackend.dto.TheaterDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TheaterServiceImpl implements TheaterService {

    @Autowired
    TheaterRepository theaterRepository;
    @Autowired
    TheaterSeatsRepository theaterSeatsRepository;
    @Override
    public TheaterDto addTheater(TheaterDto theaterDto) {
        TheaterEntity theaterEntity= TheaterConvertor.convertDtoToEntity(theaterDto);
        //adding teh theater seats
        List<TheaterSeatsEntity> seats =createTheaterSeats();
        //i need to set the theaterId for all these seats

        for(TheaterSeatsEntity theaterSeatsEntity : seats){
            theaterSeatsEntity.setTheater(theaterEntity);
        }
        theaterRepository.save(theaterEntity);

        return theaterDto;

    }
     List<TheaterSeatsEntity> createTheaterSeats() {
        List<TheaterSeatsEntity> seats=new ArrayList<>();
        seats.add(getTheaterSeats("1A",100,SeatType.CLASSIC));
        seats.add(getTheaterSeats("1B",100,SeatType.CLASSIC));
        seats.add(getTheaterSeats("1C",100,SeatType.CLASSIC));
        seats.add(getTheaterSeats("1D",100,SeatType.CLASSIC));
        seats.add(getTheaterSeats("1E",100,SeatType.CLASSIC));

        seats.add(getTheaterSeats("2A",200,SeatType.PREMIUM));
        seats.add(getTheaterSeats("2B",200,SeatType.PREMIUM));
        seats.add(getTheaterSeats("2C",200,SeatType.PREMIUM));
        seats.add(getTheaterSeats("2D",200,SeatType.PREMIUM));
        seats.add(getTheaterSeats("2E",200,SeatType.PREMIUM));
        theaterSeatsRepository.saveAll(seats);
        return seats;



    }
    TheaterSeatsEntity getTheaterSeats(String seatName, int rate, SeatType seatType){
        return TheaterSeatsEntity.builder().seatNumber(seatName).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheaterDto getTheater(int id) {
        TheaterEntity theaterEntity=theaterRepository.findById(id).get();
        TheaterDto theaterDto=TheaterConvertor.convertEntityToDto(theaterEntity);
        return theaterDto;
    }
}
