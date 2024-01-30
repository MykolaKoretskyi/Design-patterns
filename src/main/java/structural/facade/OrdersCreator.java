package structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrdersCreator {
  private static final Logger log = LoggerFactory.getLogger(OrdersCreator.class);

  public void create(String productName){
    log.info("An order has been created for the product: {}", productName);
  }

}
