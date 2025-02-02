//importing java utility arrays
import java.util.Arrays;
public class PracticingArrays{
    public static void main (String [] args ){
        //declaring arrays of Strings
        //String [] chiCast;
        //creating an array of strings
        String [] chiCast = new String[4];        
        //adding elements to arrays
        chiCast[0] = "Jake";
        chiCast[1] = "Papa";
        chiCast[2] = "Jemma";
        chiCast[3] = "Emmet";

        //displaying all element in arrays
        System.out.println(Arrays.toString(chiCast));

        System.out.println(chiCast[3]);

        chiCast[4] = "Keisha";
        System.out.println(Arrays.toString(chiCast));


        //display hello world
        System.out.println("hello world!");

        //creating array of integers
        int [] grades = new int[5];

        //adding elements to array
        grades[0] = 68;
        grades[1] = 55;
        grades[2] = 80;
        grades[3] = 95;
        grades[4] = 72;

        //display  all grades
        System.out.println(Arrays.toString(grades));
    }
}
