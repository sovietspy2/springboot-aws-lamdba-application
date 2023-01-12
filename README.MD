### SpringBoot serverless functions for AWS lambda (Example project)

#### usage:
- mvn package
- upload .JAR file with `aws` in name.
- add this to AWS lamdba runtime as handler: `org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest`
- add AWS lamdba function URL
- hit url with HTTP header: `spring.cloud.function.definition`= `createBook` or `findAll` 

#### limitations:
- java 11 is the highest supported java in AWS so can't upgrade to SpringBoot 3 and Java 17