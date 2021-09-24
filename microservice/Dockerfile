FROM adoptopenjdk/openjdk11:latest
ENV queue.manager.username=QM1
ENV queue.manager.channel=DEV.ADMIN.SVRCONN
ENV queue.manager.connection=localhost(1414)
ENV queue.manager.username=admin
ENV queue.manager.password=passw0rd
ENV SPRING_PROFILES_ACTIVE=sat
EXPOSE 9000
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]