# Journal App Backend

## Overview

This project is a backend application for a Journal App built using Spring Boot, Maven, and MongoDB. It utilizes various features of Spring Boot including Transactional, Lombok project for reducing boilerplate code, and Spring Security 6.0 without `WebSecurityConfigurerAdapter`.

## Technologies Used

- **Spring Boot**: A powerful framework for building Java-based applications.
- **Maven**: A build automation tool used for managing dependencies and building the project.
- **MongoDB**: A NoSQL database used for storing journal entries.
- **Lombok**: A library used to reduce boilerplate code by generating getters, setters, constructors, etc. automatically.
- **Spring Security 6.0**: Provides authentication and authorization capabilities for securing the application.

## Setup Instructions

1. **Clone the Repository**:
    ```
    git clone <repository-url>
    ```

2. **Build the Project**:
    ```
    cd JournalAppBackend
    mvn clean install
    ```

3. **Configure MongoDB**:
   - Make sure MongoDB is installed and running on your system.
   - Update the MongoDB connection details in the `application.properties` file.

4. **Run the Application**:
    ```
    mvn spring-boot:run
    ```

## Usage

Once the application is up and running, you can interact with it through RESTful endpoints. Here are some of the endpoints you can use:
- **Create a public user Entry**: `POST localhost:8080/journal/public/create-user`
- **Create a Journal Entry**: `POST localhost:8080/journal`
- **Get All Journal Entries**: `GET localhost:8080/journal`
- **Get a Single Journal Entry**: `GET localhost:8080/journal/id/{myId}`
- **Update a Journal Entry By ID**: `PUT localhost:8080/journal/id/{myId}`
- **Delete a Journal Entry By ID**: `DELETE localhost:8080/journal/id/{myId}`

Additionally, two new functions have been added:
- **Email Service**: Allows users to receive notifications or summaries via email.
- **Sentiment Analysis**: Provides sentiment analysis on journal content to gauge emotions or themes.

Make sure to include appropriate authentication headers if authentication is enabled.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/your-feature-name`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature-name`).
5. Create a new Pull Request.
