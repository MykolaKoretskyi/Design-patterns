package behavioral.chain_of_responsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks if the specified name contains at least 4 characters, if so, calls the following method in
 * the chain for verification.
 */

public class MinNumbOfCharacters extends ValidateUser {

  private static final Logger log = LoggerFactory.getLogger(MinNumbOfCharacters.class);

  @Override
  void check(RegisterNewUser user) {
    if (user.getUsername().length() < 4) {
      log.info("Username must contain at least 4 characters");
    } else {
      checkNext(user);
    }
  }

}
