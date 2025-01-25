import java.util.Arrays;
public class PracticingArrays{
    public static void main (String [] args ){
        //declaring arrays of Strings
        //String [] chiCast;
        String [] chiCast = new String[4];        //creating an array of strings

        chiCast[0] = "Jake";
        chiCast[1] = "Papa";
        chiCast[2] = "Jemma";
        chiCast[3] = "Emmet";
        System.out.println(Arrays.toString(chiCast));
        System.out.println("hello world!");

        int [] ages = new int[2];
        ages[0] = 1;
        ages[1] = 2;
        System.out.println(Arrays.toString(ages));
    }
}