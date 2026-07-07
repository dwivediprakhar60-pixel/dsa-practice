import java.util.Scanner;

public class Until0{
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("enter 1 to continue adding or 0 to stop");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=0){
            System.out.println(" enter the number to add");
            int b = in.nextInt();
            sum=sum+b;

            System.out.println(" enter 1 to continue adding or 0 to stop");
             n= in.nextInt();

        }
        System.out.println(" the sum is "+ " "+ sum);
    }
}
