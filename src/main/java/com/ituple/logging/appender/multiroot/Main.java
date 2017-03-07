package com.ituple.logging.appender.multiroot;
 
public class Main {
 
    public static void main( String[] args ) {
        TestService service = new TestService();
        service.retrieveMessage();
        service.retrieveMessage();
       // service.exampleException();
    }
}