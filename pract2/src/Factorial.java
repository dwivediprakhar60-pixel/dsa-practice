import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int ans=facto();
        System.out.println("Factorial of number is "+ans);

    }
    static int facto(){
        System.out.println(" enter the number");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int fac=1;
        if(n==0){
            System.out.println("answer is 0");

        }
        for(int i=1;i<n;i++){
            fac=fac*i;

        }
        return fac;
    }
}
