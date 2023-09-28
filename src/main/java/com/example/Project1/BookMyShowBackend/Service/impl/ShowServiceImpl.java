package com.example.Project1.BookMyShowBackend.Service.impl;

import com.example.Project1.BookMyShowBackend.Model.*;
import com.example.Project1.BookMyShowBackend.Repository.MovieRepsitory;
import com.example.Project1.BookMyShowBackend.Repository.ShowRepository;
import com.example.Project1.BookMyShowBackend.Repository.ShowSeatsRepository;
import com.example.Project1.BookMyShowBackend.Repository.TheaterRepository;
import com.example.Project1.BookMyShowBackend.Service.ShowService;
import com.example.Project1.BookMyShowBackend.converter.ShowConvertor;
import com.example.Project1.BookMyShowBackend.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShowServiceImpl implements ShowService {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    MovieRepsitory movieRepsitory;

    @Autowired
    TheaterRepository theaterRepository;
    @Autowired
    ShowSeatsRepository showSeatsRepository;
    @Override
    public ShowDto addShow(ShowDto showDto) {
        //we have to made the partial show entity object
        //Goal:set the Movie and the Theater Entities nd not the Dto
        ShowEntity showEntity= ShowConvertor.convertDtoToEntity(showDto);
        MovieEntity movieEntity=movieRepsitory.findById(showDto.getMovieDto().getId()).get();
        TheaterEntity theaterEntity=theaterRepository.findById(showDto.getTheaterDto().getId()).get();
        showEntity.setMovie(movieEntity);
        showEntity.setTheater(theaterEntity);

        generatedShowEntitySeats(theaterEntity.getSeats(),showEntity);
        showRepository.save(showEntity);
        return showDto;

    }

    private void generatedShowEntitySeats(List<TheaterSeatsEntity> seats,ShowEntity showEntity) {
        List<ShowSeatsEntity> showSeatsEntityList=new ArrayList<>();

        for(TheaterSeatsEntity th :seats){
            ShowSeatsEntity sh=ShowSeatsEntity.builder().seatNumber(th.getSeatNumber()).seatType(th.getSeatType()).rate(th.getRate()).show(showEntity).build();
            showSeatsEntityList.add(sh);
        }
        showSeatsRepository.saveAll(showSeatsEntityList);
    }
}
