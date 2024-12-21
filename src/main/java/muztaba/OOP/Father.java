package muztaba.OOP;

public class Father extends  GrandFather{
    static String car = "Toyota";
    static double balance = 1000000;
    int age = 55;

    public static void info(){
        System.out.println("Car: "+car);
        System.out.println("Balance: "+balance);
    }
}
