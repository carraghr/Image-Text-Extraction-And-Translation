FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/carraghr/Image-Text-Extraction-And-Translation.git

FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY --from=0 /app/Image-Text-Extraction-And-Translation/image-processing /app
RUN mvn install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=1 /app/target/imageProcessing-0.1.0.jar /app
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","imageProcessing-0.1.0.jar"]
