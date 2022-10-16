
public class Main {

  public static void main(String[] args) {

    var point1 = new Point(1, 2);
    var point2 = new Point(1, 2);

    // System.out.println(point1 == point2); false

    // System.out.println(point1.equals(point2)); false we comparing addresses
    // we need to override this method

    // After Overriding the method
    System.out.println(point1.equals(point2));

    System.out.println(point1.hashCode());
    System.out.println(point2.hashCode());
  }
}