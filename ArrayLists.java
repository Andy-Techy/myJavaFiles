// Array Operations
import java.util.ArrayList; //importing java utility arrays

public class ArrayLists {
    public static void main(String[] args) {

        //creating Array list of students
        ArrayList<String>studentNames = new ArrayList<String>();

        //MANIPULATING AND PROCESSING ARRAYLISTS

        //adding items to arrays
        studentNames.add("Mitch");
        studentNames.add("Mimi");
        studentNames.add("Divine");
        studentNames.add("Josie");
        studentNames.add("kevin");
        studentNames.set(1, "Ricch");
        System.out.println(studentNames); //displaying the content of the array

        //checking if Andy exists in Array List... should return a boolean value
        System.out.println(studentNames.contains("Andy"));
        System.out.println(studentNames.contains("divine"));
        System.out.println(studentNames.contains("Divine"));

        //checking the size of array
        System.out.println(studentNames.size());

        //accessing a particular element
        System.out.println(studentNames.indexOf("Divine"));

        System.out.println(studentNames.get(2));

        System.out.println("*************************************");
        //creating array lists of kid cudi's album
        ArrayList<String>albums = new ArrayList<String>();

        albums.add("Man on the Moon");
        albums.

        





    }

}
