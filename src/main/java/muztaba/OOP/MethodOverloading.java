package muztaba.OOP;

public class MethodOverloading {
    public static void sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    public static void sum(int a,int b,int c){
        System.out.println("Sum: "+(a+b+c));
    }

    public static void main(String[] args){
        sum(3,2);
        sum(1,5,5);
    }
}
