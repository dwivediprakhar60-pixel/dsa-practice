import java.util.Scanner;

public class Calci{
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter the operator (+,-,*,/) : ");
        char op = input.next().charAt(0);
        double result = 0;
        if (op == '+')
        {
            result=num1+num2;
        }
        else if(op == '-')
        {
            result=num1-num2;
        }
        else if(op == '*')
        {
            result=num1*num2;
        }
        else
        {
            if(num2!=0)
            {
                result=(float)(num1/num2);
            }
            else {
                System.out.println("cannot divide");
            }
        }
        System.out.println("The result of operation is: " + result);





    }

}

