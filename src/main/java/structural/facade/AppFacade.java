package structural.facade;

/**
 * This program implements the facade pattern, a structural design pattern that provides a simple
 * interface to a complex system of classes, libraries, or frameworks.
 */

public class AppFacade {

  private static final String PRODUCT_NAME = "BOSCH KGN39VL316";
  private static final String ADDRESS = "Lviv city, Lvivska street";


  public static void main(String[] args) {

    OrderProductFacade orderProductFacade = new OrderProductFacade();
    orderProductFacade.order(PRODUCT_NAME, ADDRESS);
  }

}
