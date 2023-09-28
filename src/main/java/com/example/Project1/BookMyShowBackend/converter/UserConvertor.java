package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import com.example.Project1.BookMyShowBackend.dto.UserDto;

import java.util.Optional;

public class UserConvertor {

    public static UserEntity convertDtoToEntity(UserDto userDto){
        //i need to create the user entity
        return UserEntity.builder().name(userDto.getName()).mobileno(userDto.getMobileNo()).build();
    }

    public static UserDto convertEntityToDto(UserEntity user){
        return UserDto.builder().id(user.getId()).name(user.getName()).mobileNo(user.getMobileno()).build();
    }
}
