package com.example.Project1.BookMyShowBackend.converter;

import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import com.example.Project1.BookMyShowBackend.dto.EntryRequest.UserEntryDto;
import com.example.Project1.BookMyShowBackend.dto.ResponseDto.UserResponseDto;
import com.example.Project1.BookMyShowBackend.dto.UserDto;

import java.util.Optional;

public class UserConvertor {

    public static UserEntity convertDtoToEntity(UserEntryDto userDto){
        //i need to create the user entity
        return UserEntity.builder().name(userDto.getName()).mobileno(userDto.getMobileNo()).build();
    }

    public static UserResponseDto convertEntityToDto(UserEntity user){
        return UserResponseDto.builder().id(user.getId()).name(user.getName()).mobileNo(user.getMobileno()).build();
    }
}
