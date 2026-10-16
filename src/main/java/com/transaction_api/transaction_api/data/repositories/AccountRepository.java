package com.transaction_api.transaction_api.data.repositories;

import com.transaction_api.transaction_api.data.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
