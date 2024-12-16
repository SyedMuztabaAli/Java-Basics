package muztaba;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Your name is: "+name);

        System.out.println("Enter your age: ");
        double age = scan.nextDouble();
        System.out.println("Your age is:"+ age);
    }
}
