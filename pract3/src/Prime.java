import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count=0;
        System.out.println(" Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1; i<=num;i++){
            if(num%i==0){
                count+=1;
            }


        }
        if(count==2){
            System.out.println("the number entered is prime");
        }
        else{
            System.out.println("The number entered is not prime");
        }
    }
}
