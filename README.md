# DockerIntro

## Docker info
- Docker username: alejandrodiaz101
- Docker image: personal-spring
- Docker version: 1

## Docker commands and steps
- docker login
- docker build -t **personal-spring** .
- docker tag **personal-spring** **alejandrodiaz101/personal-spring:1**
- docker push **alejandrodiaz101/personal-spring:1**
- docker run -p 8080:8080 **alejandrodiaz101/personal-spring:1**
