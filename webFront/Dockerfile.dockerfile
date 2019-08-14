From openjdk:8
copy ./target/webFront.0.1.0.jar webFront.0.1.0.jar
CMD ["java","-jar","webFront.0.1.0.jar"]