package com.transaction_api.transaction_api.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "Accounts")
public class Account {

    @Id
    private String Id;

    private String accountNumber;
    private BigDecimal balance;
}
