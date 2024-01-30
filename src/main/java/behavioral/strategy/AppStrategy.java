package behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program implements the strategy pattern, which is a behavioral design pattern that defines a
 * family of similar algorithms and places each of them in its own class. After that, the algorithms
 * can be replaced one for another directly during the execution of the program.
 */

public class AppStrategy {

  private static final Logger log = LoggerFactory.getLogger(AppStrategy.class);
  private static final double FIRST_NUMBER = 2.0;
  private static final double SECOND_NUMBER = 3.0;


  public static void main(String[] args) {

    IExecute sum = new Sum();
    double resSum = sum.execute(FIRST_NUMBER, SECOND_NUMBER);
    log.info("The sum of the indicated numbers is: {}", resSum);

    IExecute difference = new Difference();
    double resDifference = difference.execute(FIRST_NUMBER, SECOND_NUMBER);
    log.info("The difference between the specified numbers is: {}", resDifference);

    IExecute multiplication = new Multiplication();
    double resMultiplication = multiplication.execute(FIRST_NUMBER, SECOND_NUMBER);
    log.info("The product of the indicated numbers is: {}", resMultiplication);

    IExecute division = new Division();
    double resDivision = division.execute(FIRST_NUMBER, SECOND_NUMBER);
    log.info("The division of the specified numbers is equal to: {}", resDivision);
  }

}
