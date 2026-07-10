import java.util.Scanner;

public class Evenoddmethods {
    public static void main(String[] args) {
        fun();

    }
    static void fun(){
        System.out.println(" enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
