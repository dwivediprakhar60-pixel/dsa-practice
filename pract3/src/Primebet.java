import java.util.Scanner;

public class Primebet {
    public static void main(String[] args) {
        fun();
    }


    static void fun() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("enter the second number");
        int num2 = in.nextInt();
        for (int i = num1 + 1; i < num2; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}

