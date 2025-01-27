// Array Operations
import java.util.ArrayList; //importing java utility arrays

public class ArrayL {
    public static void main(String[] args) {

        //creating Array list of students
        ArrayList<String>stdNames = new ArrayList<String>();

        //MANIPULATING AND PROCESSING ARRAYLISTS

        //adding items to arrays
        stdNames.add("Mitch");
        stdNames.add("Mimi");
        stdNames.add("Divine");
        stdNames.add("Josie");
        stdNames.add("kevin");
        System.out.println(stdNames); //displaying the content of the array

        //checking if Andy exists in Array List... should return a boolean value
        System.out.println(stdNames.contains("Andy"));
        System.out.println(stdNames.contains("divine"));
        System.out.println(stdNames.contains("Divine"));

        //checking the size of array
        System.out.println(stdNames.size());

        //accessing a particular element
        System.out.println(stdNames.indexOf("Divine"));

        System.out.println(stdNames.get(2));


    }

}
