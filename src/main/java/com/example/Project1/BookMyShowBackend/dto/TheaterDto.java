package com.example.Project1.BookMyShowBackend.dto;

import lombok.*;

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
    ShowDto showDto;
}
