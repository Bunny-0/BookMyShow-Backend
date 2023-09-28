package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.dto.BookTicketRequestDto;
import com.example.Project1.BookMyShowBackend.dto.TicketDto;

public interface TicketService {

    //book ticket


    //getTicket

    TicketDto getTicket(int id);
    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
