package muztaba.OOP;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Size: "+names.size());
        names.add("muztaba");
        names.add("utshob");
        names.add(0,"Mysha");

        System.out.println(names);
        System.out.println("Size: "+names.size());

        names.remove(0);
        System.out.println(names);
        System.out.println("Size: "+names.size());

        for(int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
