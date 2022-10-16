import java.util.Arrays;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    var car = new Car();
    var boat = new Boat();
    var bicycle = new Bicycle();

    Vehicle[] vehicles = { car, boat, bicycle };

    for (Vehicle v : vehicles) {
      v.go();
    }

    int[] values = { 1, 2, 3 };

    System.out.println(Arrays.toString(values));

  }
}