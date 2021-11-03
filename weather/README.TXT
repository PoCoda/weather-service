To start application with Dockerfile use commands:

    1. mvn clean package
    2. docker build --tag=weather-service:latest .  //dot is necessary
    3. docker run -p8887:8080 weather-service:latest

Observe application running on localhost:8887 // /test endpoint to test