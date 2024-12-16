package muztaba;

public class Variables {
    static int numbers = 10;
    String text = "Hello";
    public static void main(String[] args){
        int localVaribales = 100;
        System.out.println(localVaribales);
        System.out.println(numbers);


        //Object

        Variables obj = new Variables();
        System.out.println(obj.text);
    }
}
