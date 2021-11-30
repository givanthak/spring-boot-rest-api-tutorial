FROM openjdk as base
COPY . .
RUN chmod +x mvnw
RUN ./mvnw package -DskipTests


FROM openjdk
COPY --from=base target/spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["/bin/bash","-c"]
CMD ["java -jar spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar"]