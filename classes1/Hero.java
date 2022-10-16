public class Hero extends Person {

  private String power;

  // First Initialize Constructor of Super Class
  public Hero(String name, int age, String power) {
    super(name, age); // calling Super Class Constructor using 'super'
    this.power = power;
  }

  @Override
  public String toString() {
    return super.toString() + this.power;
  }
}
