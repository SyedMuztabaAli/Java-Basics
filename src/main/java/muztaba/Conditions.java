package muztaba;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*System.out.println("Enter 1st number: ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = in.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else if (a==b) {
            System.out.println(a+" is equal to "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }*/
        System.out.println("Enter a text: ");
        String text = in.nextLine();

        if(text.equalsIgnoreCase("utshob")){
            System.out.println("Your text is utshob.");
        }
    }

}
