# Spring Transaction API

A RESTful transaction management API built with **Java and Spring Boot**, using **MongoDB** for data persistence.

## Technologies Used

- **Java 21** — Programming language
- **Spring Boot** — Application framework
- **Spring Web MVC** — REST API development
- **Spring Data MongoDB** — Database integration
- **Lombok** — Reducing boilerplate code
- **Maven** — Dependency and build management

## Project Structure

The project follows a layered architecture to separate responsibilities and make the application easier to maintain and test.

```
src/
└── main/
    ├── java/
    │   └── com/transaction_api/transaction_api/
    │       ├── controllers/
    │       ├── data/
    │       │   ├── models/
    │       │   └── repositories/w
    │       ├── dtos/
    │       ├── services/
    │       └── TransactionApiApplication.java
    └── resources/
        └── application.properties
```

## Getting Started

### Prerequisites

- Java 21 or later
- Maven (or the included Maven Wrapper)
- MongoDB

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/mortal-engines/spring-transaction-api.git
   ```
2. Navigate into the project directory:
   ```
   cd spring-transaction-api
   ```
3. Configure your MongoDB connection in `src/main/resources/application.properties`.
4. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

## Current Development

The project is currently in its initial development stage.

- Establishing the layered project structure
- Creating customer data models
- Preparing the foundation for transaction management functionality

## Future Plans

- Implement customer and transaction management
- Develop REST API endpoints
- Add service and repository logic
- Introduce request and response DTOs
- Implement automated tests
- Add validation and error handling

## Contributing

Contributions, suggestions, and feedback are welcome.

## License

No license has been specified yet.

Add the current API endpointsClarify the project’s current status