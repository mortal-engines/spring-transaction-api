package com.transaction_api.transaction_api.dtos.responses;

import com.transaction_api.transaction_api.data.models.CustomerType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerResponseDto {
    private String id;
    private String fullName;
    private CustomerType type;
    private LocalDateTime createdAt;
}
