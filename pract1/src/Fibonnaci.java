import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(" Enter the number of terms");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the first two terms");
        int fir = in.nextInt();
        int sec = in.nextInt();
        int next= 0;
        System.out.print("The Fibonnaci series is : " +fir + " "+ sec+ " ");
        for(int i = 2; i<n; i++)
        {
            next = fir+sec;
            fir=sec;
            sec=next;
            System.out.print(next+" ");

        }



    }
}
