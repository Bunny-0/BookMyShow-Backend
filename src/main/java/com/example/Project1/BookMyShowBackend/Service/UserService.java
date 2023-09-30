package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.dto.EntryRequest.UserEntryDto;
import com.example.Project1.BookMyShowBackend.dto.ResponseDto.UserResponseDto;
import com.example.Project1.BookMyShowBackend.dto.UserDto;

public interface UserService {

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);
}
