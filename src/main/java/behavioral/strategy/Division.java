package behavioral.strategy;

public class Division implements IExecute {

  @Override
  public Double execute(double a, double b) {
    if (b == 0) {
      throw new ArithmeticException("You cannot divide by zero !");
    }
    return a / b;
  }
}
