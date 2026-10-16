package com.transaction_api.transaction_api.dtos.responses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerResponseDto {

    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime createAt;
}
