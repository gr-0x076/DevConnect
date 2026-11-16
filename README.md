# DevConnect

A full-stack Spring Boot application providing developer directory services, health checks, and a responsive frontend dashboard.

## Tech Stack
- **Java 17**
- **Spring Boot 4.x** (Spring Web, Spring Test)
- **Maven** (with Maven Wrapper)
- **Frontend**: Responsive Vanilla HTML5, CSS3, Modern JavaScript (Fetch API)

## Project Structure
```text
src/
├── main/
│   ├── java/
│   │   └── com.devconnect.DevConnect/
│   │       ├── controller/
│   │       │   ├── DeveloperController.java
│   │       │   └── HealthController.java
│   │       ├── dto/
│   │       │   ├── DevelopersResponse.java
│   │       │   └── HealthResponse.java
│   │       ├── model/
│   │       │   ├── Developer.java
│   │       │   └── User.java
│   │       ├── repository/
│   │       ├── service/
│   │       │   └── DeveloperService.java
│   │       └── DevConnectApplication.java
│   └── resources/
│       ├── application.properties
│       └── static/
│           └── index.html
└── test/
    └── java/
        └── com.devconnect.DevConnect/
            └── DevConnectApplicationTests.java
```

## Getting Started

### Prerequisites
- JDK 17 or higher
- Git

### Running the Application
Using the Maven wrapper (no local Maven install required):

**Windows (PowerShell / CMD):**
```powershell
.\mvnw.cmd spring-boot:run
```

**macOS / Linux:**
```bash
./mvnw spring-boot:run
```

The application starts on port `8080` by default. Open [http://localhost:8080](http://localhost:8080) in your browser.

### Running Tests
```powershell
.\mvnw.cmd test
```

### Packaging into Executable JAR
```powershell
.\mvnw.cmd clean package
java -jar target/DevConnect-0.0.1-SNAPSHOT.jar
```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/health` | Returns backend health status |
| `GET` | `/developers` | Returns developer profiles and status |
| `GET` | `/` or `/index.html` | Serves the interactive frontend |
