FROM openjdk:8
EXPOSE 8080
ADD target/order-service-codebuild-pipeline-ecr.jar order-service-codebuild-pipeline-ecr.jar 
ENTRYPOINT ["java","-jar","/order-service-codebuild-pipeline-ecr.jar"]
