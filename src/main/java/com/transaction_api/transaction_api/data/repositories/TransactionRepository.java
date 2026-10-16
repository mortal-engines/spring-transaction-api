package com.transaction_api.transaction_api.data.repositories;

import com.transaction_api.transaction_api.data.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
