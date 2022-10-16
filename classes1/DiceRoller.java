import java.util.Random;

public class DiceRoller {

  // Global Scope
  Random random;
  int number = 0;

  public DiceRoller() {
    random = new Random();
    roll();
  }

  public void roll() {
    number = random.nextInt(6) + 1;
    System.out.println(number);
  }
}
