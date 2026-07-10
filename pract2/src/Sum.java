import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sumneg=0;
        int sumeven=0;
        int sumodd=0;
        System.out.println(" Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num!=0){
            if(num<0){
                sumneg=sumneg+num;
            }
            else if(num%2==0){
                sumeven=sumeven+num;
            }
            else{
                sumodd=sumodd+num;
            }
            System.out.println(" Enter the number");
            num=in.nextInt();

        }
        System.out.println("sum of negative number is "+" "+ sumneg);
        System.out.println("sum of even positive number"+" "+ sumeven);
        System.out.println("sum of odd positive number"+" "+ sumodd);


    }

}
