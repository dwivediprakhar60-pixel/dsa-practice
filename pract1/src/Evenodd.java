import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        if (Num % 2 == 0)
        System.out.println("Number entered is even");
        else
            System.out.println("Number entered is odd");

    }
}