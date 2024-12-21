package muztaba.OOP;

import java.util.Scanner;

public class ExceptionError {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = in.nextInt();
        System.out.println("Enter 2nd number:");
        int b = in.nextInt();

        try{
            int res = a/b;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Enter a non zero number");
        }
    }

}
