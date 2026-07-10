import java.util.Scanner;

public class Vowelorconsonant {
    public static void main(String[] args) {
        System.out.println("enter the character: ");
        Scanner in = new Scanner(System.in);
        char input= in.next().charAt(0);
        switch(input){
            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println(" The character entered is vowel  ");
                break;
            default:
                System.out.println("The character entered is a consonant");

        }

    }
}
