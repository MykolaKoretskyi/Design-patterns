package behavioral.chain_of_responsibility;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks if the specified username exists in the user list, if not then calls the next method in
 * the chain to check.
 */
public class UserExists extends ValidateUser {

  private static final Logger log = LoggerFactory.getLogger(UserExists.class);
  private static final String[] USERNAME_STORAGE = {"sunny21", "blue87", "jazz34", "sparky6"};

  @Override
  void check(RegisterNewUser user) {
    if (Arrays.asList(USERNAME_STORAGE).contains(user.getUsername().toLowerCase())) {
      log.info("Username \"{}\" already exists", user.getUsername());
    } else {
      checkNext(user);
    }
  }

}
