import java.io.IOException;

class AccountDemo {
  public int amount;

  public AccountDemo(int amount) throws IOException {
    if (amount <= 0)
      throw new IOException(); // Defensive Programming
    this.amount = amount;
  }
}

public class Account {

  public static void main(String[] args) {

    try {
      Account.show();
    }

    catch (Throwable ex) {
      System.out.println("An unexpected error occurred");
    }
  }

  public static void show() throws IOException {
    try {
      new AccountDemo(-1);
    }

    catch (IOException ex) {
      System.out.println("Logging");
      // Rethrowing Exception
      throw ex;
    }
  }

}
