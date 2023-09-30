package com.example.Project1.BookMyShowBackend.dto.ResponseDto;

import com.example.Project1.BookMyShowBackend.dto.ShowDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Builder
@Data
public class MovieResponseDto {

    int id;
    String name;
    LocalDate releaseDate;
    List<ShowDto> showDtoList;
}
