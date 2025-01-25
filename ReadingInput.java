import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);  //creating scanner variable
         String name;   //creating a variable to hold name
         System.out.print("Enter name: ");   // asking user to enter name
         name = input.next();    //reading input from the user

         System.out.println("****************************************");

         int age; //creating an integer variable
         System.out.print("Enter age: "); //asking user for age
         age = input.nextInt(); //reading input from the user

         System.out.println("****************************************");
         System.out.println("Welcome to Java" + ", " + name + "!");       //output a welcome message.
         System.out.println(name + ", you're " + age + " years old. " );    //output the user name and age.
         
         input.close();
    }
}
