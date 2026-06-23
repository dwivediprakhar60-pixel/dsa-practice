import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your Name");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Greetings " + name);
    }
}
