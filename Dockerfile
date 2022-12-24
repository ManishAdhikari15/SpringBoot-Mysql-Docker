FROM openjdk:11
EXPOSE 4300
COPY target/ExpenseTracker.jar ExpenseTracker.jar
ENTRYPOINT ["java","-jar","/ExpenseTracker.jar"]