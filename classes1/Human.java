public class Human {
  private String name;
  private int age;

  public Human() {
  }

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println(this.name + " is eating!");
  }

  public void age() {
    System.out.println(this.name + " is " + this.age + " years old");
  }

}
