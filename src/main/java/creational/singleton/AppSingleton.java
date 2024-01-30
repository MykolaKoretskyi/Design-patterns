package creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program implements the Singleton pattern, ensuring the presence of a single instance of the
 * class. When attempting to create another instance of the Singleton class, it will return the
 * previously created instance without creating a new one.
 **/

public class AppSingleton {

  private static final Logger log = LoggerFactory.getLogger(
      creational.singleton.AppSingleton.class);

  public static void main(String[] args) {

    Singleton singletonFirst = Singleton.getInstance("This is the first singleton object");
    log.info(singletonFirst.getMessage());

    Singleton singletonSecond = Singleton.getInstance("This is the second singleton object");
    log.info(singletonSecond.getMessage());

    Singleton singletonThird = Singleton.getInstance("This is the third singleton object");
    log.info(singletonThird.getMessage());
  }
}
