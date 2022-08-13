ARG java_image_tag=11-jre-slim
FROM openjdk:${java_image_tag}

RUN addgroup --gid 1000 spring && adduser --gid 1000 spring
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]