package com.example.Project1.BookMyShowBackend.dto.ResponseDto;

import com.example.Project1.BookMyShowBackend.dto.TicketDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UserResponseDto {
    int id;
    String name;
    String mobileNo;
    List<TicketDto> tickets;
}
