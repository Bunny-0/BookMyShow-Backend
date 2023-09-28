package com.example.Project1.BookMyShowBackend.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowDto {
    int id;
    LocalDate showDate;
    LocalDate showTime;

    MovieDto movieDto;
    TheaterDto theaterDto;
}
