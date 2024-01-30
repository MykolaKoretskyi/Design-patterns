package behavioral.strategy;

public class Difference implements IExecute {

  @Override
  public Double execute(double a, double b) {
    return a - b;
  }
}
