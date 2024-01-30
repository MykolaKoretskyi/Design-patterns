package behavioral.chain_of_responsibility;

public class RegisterNewUser {

  private final String username;

  public RegisterNewUser(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

}
