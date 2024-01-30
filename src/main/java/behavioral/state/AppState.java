package behavioral.state;

/**
 * This program implements the state template. Every time the publish() method is called, the object
 * changes its state and can change its behavior.
 */

public class AppState {

  public static void main(String[] args) {

    Docum docum = new Docum();

    docum.publish();
    docum.publish();
    docum.publish();
  }

}
