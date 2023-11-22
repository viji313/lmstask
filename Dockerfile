FROM eclipse-temurin:17
COPY  target/lmstask.jar lmstask.jar
CMD [ "java","-jar","lmstask.jar" ]