package com.example.Project1.BookMyShowBackend.Service;

import com.example.Project1.BookMyShowBackend.dto.UserDto;

public interface UserService {

    void addUser(UserDto userDta);

    UserDto getUser(int id);
}
