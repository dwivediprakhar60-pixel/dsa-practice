import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int b = n%i;
            if(b==0){

                System.out.println(i);
            }
        }
    }
}
