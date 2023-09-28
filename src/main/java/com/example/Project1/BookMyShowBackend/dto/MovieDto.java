package com.example.Project1.BookMyShowBackend.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MovieDto {

    int id;
    String name;
    LocalDate releaseDate;
    List<ShowDto> movies;

}
