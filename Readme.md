# Word Count Challenge

Welcome to the **Word Count Challenge**! In this project, you are tasked with implementing a series of word-counting katas using **Spring Boot** and the **JTE templating engine**.

## Overview

You will find a series of word count assignments in the `assignments` folder. Each assignment builds upon the previous one, adding more complex functionality such as counting unique words, handling hyphenated words, and calculating average word lengths.

The goal is to implement each assignment by creating a corresponding Spring Boot controller that performs the necessary logic and returns a rendered JTE template with the results.

### Requirements

- Use **Spring Boot** to create the necessary controllers.
- Render the output using **JTE** templates.
- Each assignment should be fully functional and return an HTML response using JTE.

### Assignments

The assignments are located in the `assignments` folder. Each assignment describes a new feature or adjustment to the word-counting logic. Start with the first assignment and work your way through them in order.

### Example

We’ve provided a sample implementation to help you get started. You can see the example provided in the class `ExampleController`. Feel free to refer to it to understand how to structure your Spring Boot controller and how to render a JTE template.

### JTE Documentation

For more information on how to use **JTE** templates, you can refer to the official documentation here:

[JTE Documentation](https://jte.gg/)

## Getting Started

1. Clone this repository.
2. Implement each of the assignments in the `assignments` folder.
3. Use Spring Boot and JTE for all your implementations.
4. Once you complete all the assignments, ensure everything works by running the Spring Boot application.

### Running the Application

You can run the Spring Boot application using the following command:

```bash
./mvnw spring-boot:run
```

Navigate to http://localhost:8080/ to interact with your application.

Good luck, and enjoy the challenge!