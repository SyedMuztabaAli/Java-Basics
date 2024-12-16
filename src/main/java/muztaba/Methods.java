package muztaba;

public class Methods {
    static int x =10;
    static int y = 10;

    public void case1(){
        System.out.println(x+y);
    }
    public static void case2(){
        System.out.println(x+y);
    }

    public static void sum(int a,int b){
        System.out.println("Sum: " +(a+b));
    }
    public static void sum(int a,int b,int c){
        System.out.println("Sum: " +(a+b+c));
    }

    public void mul(int a,int b){
        System.out.println("Multiplication: "+(a*b));
    }
    public static void main(String[] args){
        Methods obj = new Methods();
        sum(20,30);
        sum(30,90);
        sum(40,40);
        sum(40,40,60);
        obj.mul(3,8);
    }
}
