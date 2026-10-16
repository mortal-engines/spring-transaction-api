package com.transaction_api.transaction_api.data.repositories;

import com.transaction_api.transaction_api.data.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
