package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.Model.ShowSeatsEntity;
import com.example.Project1.BookMyShowBackend.dto.ShowSeatsDto;

import java.util.List;

public interface ShowSeatsService {

    public ShowSeatsEntity addShowSeats(ShowSeatsDto showSeatsDto);

    public List<ShowSeatsDto>  getShowSeats(int id);
}
