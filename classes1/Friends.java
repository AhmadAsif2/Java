public class Friends {
  public String name;
  private static int numberOfFriends;

  public Friends(String name) {
    this.name = name;
    numberOfFriends++;
  }

  public static void display() {
    System.out.println(numberOfFriends);
  }
}
