# Spring Boot Hello App

A simple **Spring Boot application** developed as part of the **BridgeLabz learning program** to understand the basics of Spring Boot, MVC architecture, and REST APIs.

This project demonstrates multiple use cases (UC1–UC4) including:
- Returning plain text responses
- Displaying web pages using Thymeleaf
- Creating REST APIs
- Testing APIs using Postman

---

# Tech Stack

- Java 17  
- Spring Boot  
- Maven  
- Thymeleaf  
- IntelliJ IDEA  
- Postman  
- Git & GitHub  

---

# Project Structure

```
helloapp
 ├── src
 │   ├── main
 │   │   ├── java
 │   │   │   └── com.bridgelabz.helloapp
 │   │   │        ├── HelloappApplication.java
 │   │   │        └── HelloController.java
 │   │   │
 │   │   └── resources
 │   │        ├── templates
 │   │        │    └── hello.html
 │   │        └── application.properties
 │   │
 │   └── test
 │
 ├── pom.xml
 ├── mvnw
 ├── mvnw.cmd
 └── README.md
```

---

# How to Run the Application

## 1 Clone the Repository

```
git clone https://github.com/ShivaniSivaprakasam/SpringBootHelloApp.git
```

## 2 Navigate to the Project

```
cd SpringBootHelloApp
```

## 3 Run the Spring Boot Application

Open the project in IntelliJ and run:

```
HelloappApplication.java
```

Console output should show:

```
Tomcat started on port(s): 8080
Started HelloappApplication
```

---

# Use Case Implementations

---

# UC1 – Hello World REST API

Create a simple Spring Boot REST API that returns:

```
Hello from BridgeLabz
```

### Controller

```java
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from BridgeLabz";
    }
}
```

### Test in Browser

```
http://localhost:8080
```

Output:

```
Hello from BridgeLabz
```

---

# UC2 – Display Hello Message in Web Page

Use **Spring MVC Controller** and **Thymeleaf template**.

### Controller

```java
@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";
    }
}
```

### HTML Template

Location:

```
src/main/resources/templates/hello.html
```

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Hello App</title>
</head>

<body>
<h1 th:text="${message}"></h1>
</body>

</html>
```

---

# UC3 – REST API Endpoint

Create a REST API endpoint:

```
GET /hello
```

### Controller

```java
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }
}
```

### Test in Browser

```
http://localhost:8080/hello
```

Output:

```
Hello from BridgeLabz
```

---

# UC4 – POST Request API

Create a **POST API endpoint**.

### Controller

```java
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @PostMapping("/hello")
    public String helloPost() {
        return "Hello from BridgeLabz - POST Request";
    }
}
```

---

# Testing APIs Using Postman

## GET Request

Method:

```
GET
```

URL:

```
http://localhost:8080/hello
```

Response:

```
Hello from BridgeLabz
```

---

## POST Request

Method:

```
POST
```

URL:

```
http://localhost:8080/hello
```

Response:

```
Hello from BridgeLabz - POST Request
```

---

# Git Workflow Used

This project follows **Git Flow branching strategy**.

### Create Feature Branch

```
git flow feature start UC1-hello-message-api
```

### Add Changes

```
git add src
```

### Commit Changes

```
git commit -m "[Shivani] : Added : UC1 code"
```

### Publish Branch

```
git flow feature publish UC1-hello-message-api
```

---

# Author

**Shivani Sivaprakasam**
