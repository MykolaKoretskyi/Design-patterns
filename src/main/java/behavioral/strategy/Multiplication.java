package behavioral.strategy;

public class Multiplication implements IExecute {

  @Override
  public Double execute(double a, double b) {
    return a * b;
  }
}
