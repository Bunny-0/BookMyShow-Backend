package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.TheaterEntity;
import com.example.Project1.BookMyShowBackend.dto.TheaterDto;

public class TheaterConvertor {
    public static TheaterEntity convertDtoToEntity(TheaterDto theaterDto) {
        return TheaterEntity.builder().id(theaterDto.getId()).name(theaterDto.getName()).city(theaterDto.getCity()).address(theaterDto.getAddress()).build();
    }

    public static TheaterDto convertEntityToDto(TheaterEntity theaterEntity) {
        return TheaterDto.builder().id(theaterEntity.getId()).name(theaterEntity.getName()).address(theaterEntity.getAddress()).city(theaterEntity.getCity()).build();
    }
}