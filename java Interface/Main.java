public class Main {
  public static void main(String[] args) {
    // Similar to inheritance but specifies what a class has to/must do
    var rabbit = new Rabbit();
    rabbit.flee();

    var hawk = new Hawk();
    hawk.hunt();

    var fish = new Fish();
    fish.flee();
    fish.hunt();
  }
}
