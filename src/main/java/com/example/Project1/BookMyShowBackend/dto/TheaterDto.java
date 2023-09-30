package com.example.Project1.BookMyShowBackend.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TheaterDto {
    int id;
    String name;
    String address;
    String city;
    List<ShowDto> showDtoList;
}
