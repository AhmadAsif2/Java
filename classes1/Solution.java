
/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        // Array List
        // Java Collection
        // ArrayList<String> bakeryItems = new ArrayList<>();
        // ArrayList<String> drinks = new ArrayList<>();

        // ArrayList<ArrayList<String>> items = new ArrayList<>();

        // bakeryItems.add("Bread");
        // bakeryItems.add("Eggs");
        // bakeryItems.add("Biscuits");

        // drinks.add("Soda");
        // drinks.add("Coffee");

        // System.out.println(drinks.get(0));
        // System.out.println(bakeryItems.get(2));

        // items.add(bakeryItems);
        // items.add(drinks);

        // System.out.println(items.get(0).get(1));

        // Human human = new Human("Ahmad", 19);
        // human.eat();

        // var roller = new DiceRoller();

        // Arrays of Objects
        // Food food1 = new Food("Pizza");
        // Food food2 = new Food("Burger");
        // Food food3 = new Food("Hotdog");

        // Food[] foods = { food1, food2, food3 };

        // for (int i = 0; i < foods.length; i++) {
        // System.out.print(foods[i].getName() + " ");
        // }

        // Garage garage = new Garage();
        // Car car = new Car("BMW");

        // garage.park(car);

        // Friends friend1 = new Friends("ahmad");
        // Friends friend2 = new Friends("Sultan");
        // Friends friend3 = new Friends("Waleed");

        // Friends.display(); // 3

        // Hero hero1 = new Hero("Batman", 42, "$$$");
        // System.out.println(hero1.toString());

        Car car1 = new Car("Honda", "Civic", 2022);
        Car car2 = new Car(car1);

        // car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}