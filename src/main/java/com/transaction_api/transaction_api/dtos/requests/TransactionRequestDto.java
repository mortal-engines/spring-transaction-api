package com.transaction_api.transaction_api.dtos.requests;

import com.transaction_api.transaction_api.data.models.TransactionType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionRequestDto {
    private BigDecimal amount;
    private TransactionType type;
}
