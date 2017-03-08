# Logging wrapper 2x2 


### Setup


#### Type-1
each package is having its classes and respective log4j2_xxx file.
pick up log4j2_xxx from respective package, rename it as log4j2 and place in resources folder and run the main class of respective folder.


#### Type-2
each package is having its classes and respective log4j2_xxx file.
add the following line in TestService.java
 
 param-1: "log4j.configurationFile"
 param-2: location on your log4j2_xxx.xml file.
 
 example:
 
```java
 static {
	        System.setProperty("log4j.configurationFile", "C:\\Users\\PiyushMittal\\git1\\logging-wrapper-2x2\\src\\main\\java\\com\\ituple\\logging\\level\\customlevel\\log4j2_xxx.xml");
	    }
```


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