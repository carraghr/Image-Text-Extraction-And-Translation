From openjdk:8
copy ./target/imageProcessing.0.1.0.jar imageProcessing.0.1.0.jar
CMD ["java","-jar","imageProcessing.0.1.0.jar"]