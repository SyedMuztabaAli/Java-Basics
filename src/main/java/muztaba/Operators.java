package muztaba;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = in.nextInt();

        System.out.println("Summation of a and b is: "+(a+b));
        System.out.println("Subtraction of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));
        System.out.println("Modulus of a and b is: "+(a%b));
    }
}
