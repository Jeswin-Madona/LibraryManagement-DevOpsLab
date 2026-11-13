# Library Management System

A beginner-friendly Java console application prepared for DevOps lab practice.

## Features
- Add a book
- List all books
- Search for a book by ID
- Remove a book by ID

## Requirements
- JDK 21
- Maven 3.10+
- Git (for version-control experiments)
- SonarQube Community Build and SonarScanner (for code-quality experiments)

## Run using Maven

```bash
mvn clean package
java -cp target/classes com.devlab.library.Main
```

## Run tests

```bash
mvn test
```

## SonarQube scan using SonarScanner CLI

1. Start SonarQube at http://localhost:9000.
2. Create a project with key `library-management`.
3. Generate a project analysis token and keep it private.
4. Compile the project:

```bash
mvn clean test
```

5. In a new Windows Command Prompt, set your token:

```cmd
set SONAR_TOKEN=YOUR_TOKEN
```

6. Run the scanner from the project folder:

```cmd
sonar-scanner -Dsonar.token=%SONAR_TOKEN%
```

Do not commit or share your token.

## DevOps lab usage
- Git: initialize a repository, commit changes, create a feature branch and merge it.
- SonarQube: create a project using key `library-management`.
- SonarScanner: use the included `sonar-project.properties`.
- Maven: run `mvn clean test` and `mvn clean package`.
- Artifactory: deploy the generated JAR from `target/` after configuring a repository and credentials.
- Jenkins: use the included `Jenkinsfile` after configuring matching JDK, Maven and SonarQube tool names in Jenkins.

Note: The Jenkinsfile is a starter template. Jenkins tool names and SonarQube server name must match the names configured in your Jenkins installation.
