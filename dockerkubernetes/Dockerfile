FROM openjdk:17

EXPOSE 8080

ADD target/dockerkubernetesapp.jar dockerkubernetesapp.jar

ENTRYPOINT [ "java","-jar","dockerkubernetesapp.jar" ]
