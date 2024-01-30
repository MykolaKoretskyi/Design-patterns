package structural.bridge;

/**
 * This program implements the bridge pattern, a structural design pattern that separates one or
 * more classes into two separate hierarchies—abstraction and implementation—allowing code in one
 * class branch to be changed independently of the other.
 */

public class AppBridge {

  public static void main(String[] args) {

    Shape circle = new Circle(new ColorGreen());
    circle.draw();

    circle = new Circle(new ColorYellow());
    circle.draw();

    Shape rectangle = new Rectangle(new ColorRed());
    rectangle.draw();

    rectangle = new Rectangle(new ColorGreen());
    rectangle.draw();
  }

}
