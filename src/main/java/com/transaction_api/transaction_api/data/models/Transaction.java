package com.transaction_api.transaction_api.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document
public class Transaction {
    @Id
    private String id;

    private BigDecimal amount;
    private BigDecimal discount;
    private TransactionType type;

    private LocalDateTime createAt;

    public Transaction() {
        createAt = LocalDateTime.now();
    }
}
