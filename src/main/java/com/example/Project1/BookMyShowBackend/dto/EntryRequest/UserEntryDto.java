package com.example.Project1.BookMyShowBackend.dto.EntryRequest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntryDto {

    String name;
    String mobileNo;
}
