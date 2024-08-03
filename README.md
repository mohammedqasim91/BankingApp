
# BankingApp
Final Project
## Description
A REST API for managing different types of bank accounts, including checking and savings accounts.

## Class Diagram
https://lucid.app/lucidchart/5f19cb4a-6bdc-4c49-b0cd-208382ed181a/edit?beaconFlowId=FDB8F72A2D1FFE89&invitationId=inv_31f7d87e-c961-4059-833b-edb405192af4&page=HWEp-vi-RSFO

## Setup
1. Clone the repository.
2. Configure your database in application.properties.
3. Run the application using mvn spring-boot:run.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- JUnit

## Controllers and Routes
- GET /api/accounts - Retrieve all accounts
- POST /api/accounts - Create a new account
- PUT /api/accounts/{id} - Update an account
- DELETE /api/accounts/{id} - Delete an account

## Extra Links
- [Trello Board][((https://trello.com/b/aQvIufUm/ironhack-final-project))](https://trello.com/b/aQvIufUm/ironhack-final-project)
- [Presentation Slides](https://calendly.com/salvatore-corsaro-ironhack/15min?month=2024-07)

## Future Work
- Add more account types
- Implement advanced security features
