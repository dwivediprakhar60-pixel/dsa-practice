import java.util.Scanner;

public class Sum {
    public static void main(String[] arg){
         Scanner input = new Scanner(System.in);
        System.out.print("enter the first number = ");
         int num = input.nextInt();
        System.out.print("enter the second number = ");
         int num2 = input.nextInt();
         int sum = num +num2;

        System.out.println("Sum is = " + sum);

    }
}
