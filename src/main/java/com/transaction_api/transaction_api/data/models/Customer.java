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

    private String firstName;
    private String lastName;
    private LocalDateTime time;

    public Customer() {
        time = LocalDateTime.now();
    }
}