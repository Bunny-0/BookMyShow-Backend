package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.ShowEntity;
import com.example.Project1.BookMyShowBackend.dto.ShowDto;

public class ShowConvertor {
    public static ShowEntity convertDtoToEntity(ShowDto showDto){
        return ShowEntity.builder().showDate(showDto.getShowDate()).showTime(showDto.getShowTime()).build();

    }

    public static ShowEntity convertEntityToDto(ShowEntity showEntity){

    }
}
