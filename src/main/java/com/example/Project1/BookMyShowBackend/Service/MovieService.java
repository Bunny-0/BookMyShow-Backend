package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.Model.MovieEntity;
import com.example.Project1.BookMyShowBackend.dto.EntryRequest.MovieEntryDto;
import com.example.Project1.BookMyShowBackend.dto.MovieDto;
import com.example.Project1.BookMyShowBackend.dto.ResponseDto.MovieResponseDto;

public interface MovieService {


    //add Movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);

    MovieResponseDto getMovie(int id);
}
