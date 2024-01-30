package behavioral.chain_of_responsibility;

public abstract class ValidateUser {

  private ValidateUser next;

  public void setNext(ValidateUser validateUser) {
    this.next = validateUser;
  }

  protected void checkNext(RegisterNewUser user) {
    if (next != null) {
      next.check(user);
    }
  }

  abstract void check(RegisterNewUser user);

}
