import java.util.ArrayList;
public class ArrayListManipulation {
    public static void main (String [] args ) {

        ArrayList<String>letterManipulate = new ArrayList<String>(5);

        //checking the size of the array list
        System.out.println(letterManipulate.size());

        letterManipulate.add(0, "A");
        System.out.println(letterManipulate);

        letterManipulate.add(0, "B");
        System.out.println(letterManipulate);

        letterManipulate.get(1);
        System.out.println(letterManipulate);
        
        // System.out.println(letterManipulate.size());

        // letterManipulate.("A");
        // letterManipulate.add("A");
        // letterManipulate.add("A");
        // letterManipulate.add("A");

    }
}
