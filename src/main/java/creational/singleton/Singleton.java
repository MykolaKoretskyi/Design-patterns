package creational.singleton;

/**
 * When attempting to create a new object of this class, the previously created object will be
 * returned if such an object has been created before.
 */
public class Singleton {

  private final String message;
  private static Singleton instance;

  private Singleton(String message) {
    this.message = message;
  }

  public static Singleton getInstance(String message) {
    if (instance == null) {
      instance = new Singleton(message);
    }
    return instance;
  }

  public String getMessage() {
    return message;
  }
}
