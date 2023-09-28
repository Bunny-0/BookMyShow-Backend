package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.Service.impl.TheaterServiceImpl;
import com.example.Project1.BookMyShowBackend.dto.TheaterDto;

public interface TheaterService {

    TheaterDto addTheater(TheaterDto theaterDto);
    TheaterDto getTheater(int id);
}
