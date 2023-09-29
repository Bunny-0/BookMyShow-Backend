package com.example.Project1.BookMyShowBackend.dto;

import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class TicketDto {
    int id;
    String alloted_seats;
    double amount;
    UserDto userDto;
    ShowDto showDto;

}
