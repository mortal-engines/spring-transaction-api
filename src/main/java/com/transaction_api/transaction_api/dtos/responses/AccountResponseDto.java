package com.transaction_api.transaction_api.dtos.responses;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public class AccountResponseDto {

    private String id;
    private String customerId;
    private String accountNumber;
    private BigDecimal balance;
}
