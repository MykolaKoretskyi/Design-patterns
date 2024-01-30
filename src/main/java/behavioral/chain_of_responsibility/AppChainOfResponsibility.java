package behavioral.chain_of_responsibility;


/**
 * This program implements the Chains of Responsibility behavioral pattern. Allows requests to be
 * sent sequentially through a chain of handlers. Each subsequent handler decides whether it can
 * handle the request itself and whether it should pass the request further down the chain.
 */

public class AppChainOfResponsibility {

  private static final String USERNAME_FIRST = "Sun";
  private static final String USERNAME_SECOND = "admin";
  private static final String USERNAME_THIRD = "Sunny21";
  private static final String USERNAME_FOURTH = "Sunny22";


  public static void main(String[] args) {

    ValidateUser validateMinUsername = new MinNumbOfCharacters();
    ValidateUser validateUsernameExists = new UserExists();
    ValidateUser validateInvalidUsernames = new InvalidUsernames();

    validateMinUsername.setNext(validateUsernameExists);
    validateUsernameExists.setNext(validateInvalidUsernames);

    // We call a chain of checks for each username.
    validateMinUsername.check(new RegisterNewUser(USERNAME_FIRST));
    validateMinUsername.check(new RegisterNewUser(USERNAME_SECOND));
    validateMinUsername.check(new RegisterNewUser(USERNAME_THIRD));
    validateMinUsername.check(new RegisterNewUser(USERNAME_FOURTH));
  }

}
