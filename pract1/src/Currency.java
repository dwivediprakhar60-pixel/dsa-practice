import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println(" Enter the amount in INR");
        Scanner input = new Scanner(System.in);
        float INR = input.nextFloat();
        float USD= INR*94.66f;
        System.out.println("the value of inr in usd is: " + USD);

    }
}
