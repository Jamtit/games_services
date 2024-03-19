FROM amazoncorretto:21
WORKDIR /app
EXPOSE 80

# Copy necessary files for Gradle setup
COPY build.gradle settings.gradle gradlew /app/
COPY gradle /app/gradle

# Run Gradle setup
RUN ./gradlew --version

# Copy the rest of the application files
COPY . /app

# Build the application
RUN ./gradlew build

# Copy the built JAR file to the app directory
COPY build/libs/VideoGames-0.0.1-SNAPSHOT.jar /app/games.jar

# Command to run the application
CMD ["java", "-jar", "games.jar"]
