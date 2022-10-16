/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    var list = new Generics<Integer>();

    // list.add(12); // Boxing
    // list.add(10);

    // int number = list.get(0); // Unboxing
    // int number1 = list.get(1);

    // System.out.println(number);
    // System.out.println(number1);

    // var user1 = new User(10);
    // var user2 = new User(20);

    // if (user1.compareTo(user2) > 0)
    // System.out.println("User1 > User2");
    // else if (user1.compareTo(user2) == 0)
    // System.out.println("User1 == User2");
    // else
    // System.out.println("User1 < User2");

    var value = Utils.max(1, 2);
    var result = Utils.max(new User(10), new User(20));

    System.out.println(value);
    System.out.println(result);

    Utils.print("ahmad", 10);
  }
}