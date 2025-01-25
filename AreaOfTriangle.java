import java.util.Scanner; //importing the scanner class 


public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creating scanner object
        final double half = 0.5; //assigning a constant variable
        int length; //declaring a length variable
        System.out.print("Enter length of triangle: "); //prompt user for the length of the triangle
        length = input.nextInt(); //reading integer input

        System.out.println("*******************************");

        double height; //declaring a height
        System.out.print("Enter height of triangle: "); //prompting user for the 
        height = input.nextDouble(); //reading input

        System.out.println("*******************************");
        double area = half * length * height; //computing the area of the triangle.
        System.out.println("The Area of the Triangle is " + area);
        System.out.println("*******************************");
        input.close();// closing the scanner object.
    }    
}
 