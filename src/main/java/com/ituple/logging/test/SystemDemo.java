package com.ituple.logging.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SystemDemo {

  static Logger log = LogManager.getLogger(SystemDemo.class.getName());

public static void main(String[] args)
{
 /*log.trace("---------------------------------------------------------------------------->trace");
 log.debug("debug");
 log.info("info");
 log.warn("warn");
 log.error("error");
 log.fatal("fatal");
 */
	 log.debug("Debug Message Logged !!!");
     log.info("Info Message Logged !!!","var1");
     log.error("Error Message Logged !!!", new NullPointerException("NullError"));
     
 
     
  //   hello();
     
}

private static void hello() {
	// TODO Auto-generated method stub
	log.entry("asdasdasdasd",new String("param1"),new String("param2"));
    log.exit("exit");
}
} 