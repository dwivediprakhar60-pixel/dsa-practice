import java.util.Scanner;

public class Simpleint {
    public static void main(String[] args) {
        System.out.println("enter the values to calculate simple interest");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle value :");
        int princ = input.nextInt();
        System.out.print("Enter rate in percent : ");
        int rate = input.nextInt();
        System.out.print("Enter time : ");
        float time = input.nextFloat();
        System.out.println("The simple interest is");
        float si = (princ*rate*time)/100f;
        System.out.println(si);
    }
}
