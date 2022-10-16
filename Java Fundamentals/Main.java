import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = greetUser("Ahmad", "Asif");
        System.out.println(message);
    }

    // Java Methods
    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
