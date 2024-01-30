package behavioral.strategy;

public class Sum implements IExecute {

  @Override
  public Double execute(double a, double b) {
    return a + b;
  }
}
