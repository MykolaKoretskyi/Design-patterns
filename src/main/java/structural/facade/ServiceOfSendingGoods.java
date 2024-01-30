package structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceOfSendingGoods {
  private static final Logger log = LoggerFactory.getLogger(ServiceOfSendingGoods.class);

  public void send(String productName, String address){
    log.info("{} sent to the specified address: {}", productName, address);
  }

}
