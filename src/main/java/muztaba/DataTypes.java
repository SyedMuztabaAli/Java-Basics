package muztaba;

public class DataTypes {
    public static void main(String[] args){
        //Primitive data types
        //Syntax: Variable_type variable_name = variable_value

        int number = 100;
        float number2 = 10.45f;
        double number3 = 123444.22233;
        char letter = 'a';
        boolean bool = true;


        System.out.println("Int Number:"+number);
        System.out.println("Float Number:"+number2);
        System.out.println("Double Number:"+number3);
        System.out.println("Char Value:"+letter);
        System.out.println("Boolean:"+bool);

        System.out.println("Int Number:"+number+", Float Number:"+number2+", Double Number:"+number3+", Char Value:"+letter+", Boolean:"+bool);

        //Non-primitive data type

        String name = "Muztaba";
        int[] num = {1,4,3,5};
        System.out.println("Name:"+name);
        System.out.println("Numbers:"+num[1]);


    }
}
