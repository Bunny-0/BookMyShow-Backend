package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.dto.MovieDto;

public interface MovieService {


    //add Movie
    MovieDto addMovie(MovieDto movieDto);

    MovieDto getMovie(int id);
}
