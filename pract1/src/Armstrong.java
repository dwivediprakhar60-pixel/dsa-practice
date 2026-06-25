import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        int n=0,m=0,z=0,u=0;
        System.out.println("Enter the two  numbers ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int orinum1 = num1;
        int orinum2 = num2;
        while(num1!=0){
            n++;
            num1 = num1/10;
        }
        while(num2!=0){
            m++;
            num2 = num2/10;
        }
        num1=orinum1;
        num2=orinum2;

        while(num1>0){
            int c= num1%10;
            int d=(int)(Math.pow(c,n));
            z=d+z;
            num1=num1/10;
        }
        while(num2>0){
            int e= num2%10;
            int f=(int)(Math.pow(e,m));
            u=f+u;
            num2=num2/10;
        }
        if(z==orinum1){
            System.out.println("the first number entered: "+ orinum1+" is palindrome");
        }
        else{
            System.out.println("the first number entered: "+ orinum1+" is not palindrome");
        }
        if(u==orinum2){
            System.out.println("the second number entered: "+ orinum2+" is palindrome");
        }
        else{
            System.out.println("the second number entered: "+ orinum2+" is not palindrome");
        }
        in.close();

        }
    }

