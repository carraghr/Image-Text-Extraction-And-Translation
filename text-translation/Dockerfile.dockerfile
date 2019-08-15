From openjdk:8
copy ./target/textTranslation.0.1.0.jar textTranslation.0.1.0.jar
CMD ["java","-jar","textTranslation.0.1.0.jar"]