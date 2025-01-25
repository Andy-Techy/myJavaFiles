import java.util.Scanner; //importing java utility scanner

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creating scanner variable

        double radius; //creating a radius variable
        System.out.print("Enter radius: "); //prompting user for radius
        radius = input.nextDouble(); //reading output from user

        System.out.println("****************************************************************************");

        final double pi = 3.142;
        double area = radius * radius * pi; //assigning area

        System.out.println("The area of a circle with radius " + radius + " is " + area + ".");

        input.close();
    }
}