package com.example.Project1.BookMyShowBackend.Service.impl;

import com.example.Project1.BookMyShowBackend.Model.UserEntity;
import com.example.Project1.BookMyShowBackend.Repository.UserRepository;
import com.example.Project1.BookMyShowBackend.Service.UserService;
import com.example.Project1.BookMyShowBackend.converter.UserConvertor;
import com.example.Project1.BookMyShowBackend.dto.EntryRequest.UserEntryDto;
import com.example.Project1.BookMyShowBackend.dto.ResponseDto.UserResponseDto;
import com.example.Project1.BookMyShowBackend.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserEntryDto userEntryDto) {

        //create an method.. that conerts UserDto to UserEntity

        UserEntity userEntity= UserConvertor.convertDtoToEntity(userEntryDto);
        userRepository.save(userEntity);


    }

    @Override
    public UserResponseDto getUser(int id) {

        UserEntity userEntity=userRepository.findById(id).get();
        // i need to return the userDto
        //so i will have to convert the entity to Dto
        UserResponseDto userResponseDto=UserConvertor.convertEntityToDto(userEntity);

        return userResponseDto;
    }
}
