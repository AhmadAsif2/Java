// Custom Exception Class
public class InsufficientFundsException extends Exception {

  InsufficientFundsException() {
    super("Insufficient funds in your account");
  }

  InsufficientFundsException(String message) {
    super(message);
  }
}