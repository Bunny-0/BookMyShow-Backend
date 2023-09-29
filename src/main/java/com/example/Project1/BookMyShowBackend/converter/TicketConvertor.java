package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.TicketEntity;
import com.example.Project1.BookMyShowBackend.dto.TicketDto;

public class TicketConvertor {

    public static TicketDto convertEntityToDto(TicketEntity ticketEntity){
     return TicketDto.builder().id(ticketEntity.getId()).amount(ticketEntity.getAmount()).alloted_seats(ticketEntity.getAllottedSeats()).build();

    }
}
