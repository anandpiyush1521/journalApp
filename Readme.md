
# Journal App Backend

This project is a backend application for a Journal App built using Spring Boot, Maven, and MongoDB. It utilizes various features of Spring Boot including Transactional, Lombok project for reducing boilerplate code, and Spring Security 6.0 without WebSecurityConfigurerAdapter.


## Tech Stack

**Spring Boot:** A powerful framework for building Java-based applications.

**Maven:** A build automation tool used for managing dependencies and building the project.

**MongoDB:** A NoSQL database used for storing journal entries.

**Lombook:** A library used to reduce boilerplate code by generating getters, setters, constructors, etc. automatically.

**Spring Security 6.0** Provides authentication and authorization capabilities for securing the application.



## Installation

Clone the Repository:

```bash
  git clone <repository-url>
```

Build the Project:

```bash
  cd JournalAppBackend
  mvn clean install
```

Configure MongoDB:

```bash
  Make sure MongoDB is installed and running on your system.
  Update the MongoDB connection details in the application.properties file.
```

Run the Application:

```bash
  mvn spring-boot:run
```
    
## API Reference - Usage

#### Create a public user Entry

```http
  POST localhost:8080/journal/public/create-user
```

#### Create a Journal Entry

```http
  POST localhost:8080/journal
```

#### Get All Journal Entries

```http
  GET localhost:8080/journal
```


#### Get a Single Journal Entry

```http
  GET localhost:8080/journal/id/{myId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `myId`      | `ObjectId` | **Required**. Id of user to fetch user's journal Entry|

#### Update a Journal Entry By ID

```http
  PUT localhost:8080/journal/id/{myId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `myId`      | `ObjectId` | **Required**. Id of user to Update user's journal Entry|

#### Delete a Journal Entry By ID

```http
  DELETE localhost:8080/journal/id/{myId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `myId`      | `ObjectId` | **Required**. Id of user to Delete user's journal Entry|


##### Additionally, two new functions have been added:

#### Email Service:

```bash
  Allows users to receive notifications or summaries via email.
```

#### Sentiment Analysis:

```bash
  Provides sentiment analysis on journal content to gauge emotions or themes.
```
Make sure to include appropriate authentication headers if authentication is enabled.



## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.

