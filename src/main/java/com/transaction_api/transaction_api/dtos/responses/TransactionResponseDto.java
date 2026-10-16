package com.transaction_api.transaction_api.dtos.responses;

import com.transaction_api.transaction_api.data.models.TransactionType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionResponseDto {
    private String id;
    private BigDecimal amount;
    private TransactionType type;
    private LocalDateTime createdAt;
}

