package com.example.Project1.BookMyShowBackend.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowDto {
    int id;
    LocalDate showDate;
    LocalTime showTime;

    MovieDto movieDto;
    TheaterDto theaterDto;
}
