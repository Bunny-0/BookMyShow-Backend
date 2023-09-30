package com.example.Project1.BookMyShowBackend.dto.EntryRequest;

import com.example.Project1.BookMyShowBackend.dto.MovieDto;
import com.example.Project1.BookMyShowBackend.dto.TheaterDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowEntryDto {

    @NotNull
    LocalDate showDate;
    @NotNull
    LocalTime showTime;
    @NotNull
    MovieDto movieDto;
    @NotNull
    TheaterDto theaterDto;
}
