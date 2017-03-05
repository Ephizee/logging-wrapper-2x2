# Logging wrapper 2x2 


### Setup

its a sample POC for log4j2.
each package is having its classes and respective log4j2 file.
pick up log4j2 from respective package and place in resources folder and run main class.


### Maven

the following dependency is only required in nosql appender.

```xml
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.8.1</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-nosql</artifactId>
			<version>2.8</version>
		</dependency>
		 <dependency>
			<groupId>org.mongodb</groupId>
			<artifactId>mongo-java-driver</artifactId>
			<version>2.11.3</version>
		</dependency> 

```

the following code in main is used to run the logging.

```java
public class Main {
    public static void main( String[] args ) {
        TestService service = new TestService();
        service.retrieveMessage();
        service.retrieveMessage();
       // service.exampleException();
    }
}
```