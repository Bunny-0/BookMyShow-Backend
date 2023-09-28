package com.example.Project1.BookMyShowBackend.dto;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    int id;
    @NotNull
    String name;
    @NotNull
    String mobileNo;
}
