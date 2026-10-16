package com.transaction_api.transaction_api.services;

import com.transaction_api.transaction_api.dtos.requests.CustomerRequestDto;
import com.transaction_api.transaction_api.dtos.responses.CustomerResponseDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerResponseDto createCustomer(CustomerRequestDto request) {

        if (request.getFirstName().isBlank() || request.getLastName().isBlank() || request.getType() == null) {
            throw new IllegalArgumentException(
                    "First name, last name, and customer type cannot be blank"
            );
        }

        if (request.getFirstName().trim().length() < 3 || request.getLastName().trim().length() < 3) {
            throw new IllegalArgumentException(
                    "First name and last name must contain at least 3 characters"
            );
        }

        if (!request.getFirstName().matches("[a-zA-Z]+")
                || !request.getLastName().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(
                    "Names must contain only letters"
            );
        }

        CustomerResponseDto response = new CustomerResponseDto();
        response.setFullName(request.getFirstName() + " " + request.getLastName());
        response.setType(request.getType());

        return response;
    }
}