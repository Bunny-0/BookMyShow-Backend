package com.example.Project1.BookMyShowBackend.dto.EntryRequest;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data

public class MovieEntryDto {

    String name;
    LocalDate releaseDate;


}
