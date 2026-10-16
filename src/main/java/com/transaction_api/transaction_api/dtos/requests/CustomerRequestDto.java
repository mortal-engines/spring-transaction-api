package com.transaction_api.transaction_api.dtos.requests;

import com.transaction_api.transaction_api.data.models.CustomerType;
import lombok.Data;

@Data
public class CustomerRequestDto {
    private String firstName;
    private String lastName;
    private CustomerType type;
}
