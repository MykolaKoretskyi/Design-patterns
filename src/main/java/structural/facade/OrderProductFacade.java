package structural.facade;

public class OrderProductFacade {

  public void order(String productName, String address){

    OrdersCreator ordersCreator = new OrdersCreator();
    ordersCreator.create(productName);

    TakeFromWarehouse takeFromWarehouse = new TakeFromWarehouse();
    takeFromWarehouse.take(productName);

    ServiceOfSendingGoods sendingGoods = new ServiceOfSendingGoods();
    sendingGoods.send(productName, address);
  }

}
