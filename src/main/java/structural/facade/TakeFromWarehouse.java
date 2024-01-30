package structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeFromWarehouse {
  private static final Logger log = LoggerFactory.getLogger(TakeFromWarehouse.class);

  public void take(String productName){
    log.info("{} is received accordingly and it is ready to be sent to the client", productName);
  }

}
