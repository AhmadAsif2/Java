import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter the dividend: ");
      short dividend = scanner.nextShort();

      System.out.print("Enter the divisor: ");
      short divisor = scanner.nextShort();

      float result = (float) (dividend / divisor);
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("You can't divide by zero");
    } catch (InputMismatchException e) {
      System.out.println("You can't divide by string");
    } finally {
      scanner.close();
      System.out.println("Scanner closed");
    }
  }
}