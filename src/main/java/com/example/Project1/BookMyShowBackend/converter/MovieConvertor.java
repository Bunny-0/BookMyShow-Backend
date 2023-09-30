package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.MovieEntity;
import com.example.Project1.BookMyShowBackend.dto.EntryRequest.MovieEntryDto;
import com.example.Project1.BookMyShowBackend.dto.MovieDto;
import com.example.Project1.BookMyShowBackend.dto.ResponseDto.MovieResponseDto;

public class MovieConvertor {


    public static MovieEntity convertDtoToEntity(MovieEntryDto movieDto){
        return MovieEntity.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }

    public static MovieResponseDto convertEntityToDto(MovieEntity movieEntity){

        return MovieResponseDto.builder().name(movieEntity.getName()).id(movieEntity.getId()).releaseDate(movieEntity.getReleaseDate()).build();

    }
}
