package com.example.Project1.BookMyShowBackend.Service.impl;

import com.example.Project1.BookMyShowBackend.Model.MovieEntity;
import com.example.Project1.BookMyShowBackend.Repository.MovieRepsitory;
import com.example.Project1.BookMyShowBackend.Service.MovieService;
import com.example.Project1.BookMyShowBackend.converter.MovieConvertor;
import com.example.Project1.BookMyShowBackend.dto.MovieDto;
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
    public MovieDto addMovie(MovieDto movieDto) {
     // if teh movie is already tehir then we have to throw the excep
        if(movieDto.getId()<0){
            throw new EntityNotFoundException("movie can't be found");
        }
        List<MovieEntity> list=movieRepsitory.findAll();
        for(MovieEntity movie : list){
            if(movie.getName().equalsIgnoreCase(movieDto.getName())){
                throw new EntityNotFoundException("Record already exists");
            }
        }

        log.info("Adding the movie",movieDto);
        MovieEntity movieEntity= MovieConvertor.convertDtoToEntity(movieDto);
        movieRepsitory.save(movieEntity);
        return movieDto;

    }

    @Override
    public MovieDto getMovie(int id) {
        MovieEntity movieEntity=movieRepsitory.findById(id).get();
        MovieDto movieDto=MovieConvertor.convertEntityToDto(movieEntity);
        return movieDto;
    }
}
