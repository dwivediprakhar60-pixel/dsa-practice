import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<n;i++){
            int b = n%i;
            if(b==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("the number is perfect");
        }
        else{
            System.out.println(" number not perfect");
        }
    }
}
