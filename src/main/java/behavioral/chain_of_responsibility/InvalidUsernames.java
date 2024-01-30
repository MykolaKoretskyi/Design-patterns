package behavioral.chain_of_responsibility;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks if the specified login username is valid, if so, calls the next method in the chain to
 * check.
 */

public class InvalidUsernames extends ValidateUser {

  private static final Logger log = LoggerFactory.getLogger(InvalidUsernames.class);
  private static final String[] INVALID_USERNAMES = {"user", "admin"};

  @Override
  void check(RegisterNewUser user) {
    if (Arrays.asList(INVALID_USERNAMES).contains(user.getUsername().toLowerCase())) {
      log.info("You have entered an invalid username: \"{}\"", user.getUsername());
    } else {
      log.info("Username \"{}\" passed all checks successfully!", user.getUsername());
    }
  }

}
