package com.transaction_api.transaction_api.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    private String fullName;
    private CustomerType type;
    private LocalDateTime createdAt;

    public Customer() {
        createdAt = LocalDateTime.now();
    }
}