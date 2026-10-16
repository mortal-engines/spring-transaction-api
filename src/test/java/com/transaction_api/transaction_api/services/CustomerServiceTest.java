package com.transaction_api.transaction_api.services;

import com.transaction_api.transaction_api.data.models.CustomerType;
import com.transaction_api.transaction_api.dtos.requests.CustomerRequestDto;
import com.transaction_api.transaction_api.dtos.responses.CustomerResponseDto;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    @ParameterizedTest
    @CsvSource({
            "John, Doe, 'John Doe', RETAIL",
            "Jane, Smith, 'Jane Smith', BUSINESS",
            "David, James, 'David James', RETAIL"
    })
    void createCustomer_shouldReturnCustomerResponseDto(
            String firstName,
            String lastName,
            String expectedFullName,
            CustomerType type) {

        CustomerRequestDto request = new CustomerRequestDto();
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setType(type);

        CustomerService customerService = new CustomerService();

        CustomerResponseDto response = customerService.createCustomer(request);

        assertNotNull(response);
        assertEquals(expectedFullName, response.getFullName());
        assertEquals(type, response.getType());
    }

    @ParameterizedTest
    @CsvSource({
            "'', '', RETAIL",
            "'John', ' ', RETAIL",
            "' ', ' ', RETAIL"
    })
    void createCustomer_withMissingCredentials(
            String firstName,
            String lastName,
            CustomerType type) {

        CustomerRequestDto request = new CustomerRequestDto();
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setType(type);

        CustomerService customerService = new CustomerService();

        assertThrows(IllegalArgumentException.class,
                () -> customerService.createCustomer(request));
    }

    @ParameterizedTest
    @CsvSource({
            "'J', 'D', RETAIL",
            "'Jo', 'Do', RETAIL",
            "'Ka', 'I', RETAIL"
    })
    void createCustomer_withShortNames(
            String firstName,
            String lastName,
            CustomerType type) {

        CustomerRequestDto request = new CustomerRequestDto();
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setType(type);

        CustomerService customerService = new CustomerService();

        assertThrows(IllegalArgumentException.class,
                () -> customerService.createCustomer(request));
    }

    @ParameterizedTest
    @CsvSource({
            "'@John', '?Doe', RETAIL",
            "'#Jay', 'Doe$', BUSINESS",
            "'_Jay', '__Doe$', RETAIL",
    })
    void createCustomer_withSpecialCharacters(
            String firstName,
            String lastName,
            CustomerType type) {

        CustomerRequestDto request = new CustomerRequestDto();
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setType(type);

        CustomerService customerService = new CustomerService();

        assertThrows(IllegalArgumentException.class,
                () -> customerService.createCustomer(request));
    }

    @ParameterizedTest
    @CsvSource({
            "'1John', '2Doe', RETAIL",
            "'3Jay', 'Doe4', BUSINESS",
            "'5Jay', '6Doe', RETAIL"
    })
    void createCustomer_withNamesStartingWithNumbers(
            String firstName,
            String lastName,
            CustomerType type) {

        CustomerRequestDto request = new CustomerRequestDto();
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setType(type);

        CustomerService customerService = new CustomerService();

        assertThrows(IllegalArgumentException.class,
                () -> customerService.createCustomer(request));
    }
}