package com.example.Project1.BookMyShowBackend.Service.impl;

import com.example.Project1.BookMyShowBackend.Model.MovieEntity;
import com.example.Project1.BookMyShowBackend.Repository.MovieRepsitory;
import com.example.Project1.BookMyShowBackend.Service.MovieService;
import com.example.Project1.BookMyShowBackend.converter.MovieConvertor;
import com.example.Project1.BookMyShowBackend.dto.EntryRequest.MovieEntryDto;
import com.example.Project1.BookMyShowBackend.dto.MovieDto;
import com.example.Project1.BookMyShowBackend.dto.ResponseDto.MovieResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j

public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepsitory movieRepsitory;
    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {
        List<MovieEntity> list=movieRepsitory.findAll();
        for(MovieEntity movie : list){
            if(movie.getName().equalsIgnoreCase(movieEntryDto.getName())){
                throw new EntityNotFoundException("Record already exists");
            }
        }

        log.info("Adding the movie",movieEntryDto);
        MovieEntity movieEntity= MovieConvertor.convertDtoToEntity(movieEntryDto);
        movieRepsitory.save(movieEntity);
        MovieResponseDto movieResponseDto=MovieConvertor.convertEntityToDto(movieEntity);
        return movieResponseDto;

    }

    @Override
    public MovieResponseDto getMovie(int id) {
        MovieEntity movieEntity=movieRepsitory.findById(id).get();
        MovieResponseDto movieResponseDto=MovieConvertor.convertEntityToDto(movieEntity);
        return movieResponseDto;
    }
}
