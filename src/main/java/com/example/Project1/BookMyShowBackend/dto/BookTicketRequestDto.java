package com.example.Project1.BookMyShowBackend.dto;

import com.example.Project1.BookMyShowBackend.Enum.SeatType;
import lombok.*;

import java.util.Set;

@Data
@Builder
public class BookTicketRequestDto {

    Set<String> requestedSeats;
    int id;
    int showId;
    SeatType seatType;
}
