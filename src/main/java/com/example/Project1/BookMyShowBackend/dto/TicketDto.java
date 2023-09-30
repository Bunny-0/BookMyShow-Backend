package com.example.Project1.BookMyShowBackend.dto;

import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class TicketDto {
    int id;
    String alloted_seats;
    double amount;
    @NotNull
    UserDto userDto;
    ShowDto showDto;

}
