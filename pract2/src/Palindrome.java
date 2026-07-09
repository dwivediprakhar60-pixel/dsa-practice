import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans=pali();
        System.out.println("the answer is "+ ans);
    }
    static boolean pali(){
        System.out.println("enter the number");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        if(n<0){
            return false;
        }
        int original=n;
        int rever=0;
        while(n>0){
            int num=n%10;
            rever=(rever*10)+num;
            n=n/10;

        }
        return original==rever;

    }

}
