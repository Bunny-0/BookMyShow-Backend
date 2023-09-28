package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.MovieEntity;
import com.example.Project1.BookMyShowBackend.dto.MovieDto;

public class MovieConvertor {


    public static MovieEntity convertDtoToEntity(MovieDto movieDto){
        return MovieEntity.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }

    public static MovieDto convertEntityToDto(MovieEntity movieEntity){

        return MovieDto.builder().name(movieEntity.getName()).id(movieEntity.getId()).releaseDate(movieEntity.getReleaseDate()).build();

    }
}
