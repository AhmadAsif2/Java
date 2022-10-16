public class Fish implements Prey, Predator {

  @Override
  public void flee() {
    System.out.println("The fish is fleeing from larger fish");
  }

  @Override
  public void hunt() {
    System.out.println("Sharks are hunting");
  }
}