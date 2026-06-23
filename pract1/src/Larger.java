import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        System.out.println("Enter the numbers to be compared");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2)
        {
            System.out.println("The largest number is: " + num1);
        }
        else
        {
            System.out.println("The largest number is: " + num2);
        }

    }
}
