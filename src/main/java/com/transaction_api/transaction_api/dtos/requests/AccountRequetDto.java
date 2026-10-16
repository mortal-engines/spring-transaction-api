package com.transaction_api.transaction_api.dtos.requests;

import lombok.Data;

@Data
public class AccountRequetDto {

    private String customerId;
    private String accountNumber;
}