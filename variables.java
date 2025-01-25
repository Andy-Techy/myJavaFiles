public class variables {
    //enumerated types
    enum course {CE, CY, IS}

    public static void main (String[] args) {

        //variables for text
        String studName = "Michael Andrew Adjei";
        String studHostel = "Yankey hostel";
        System.out.println(studName + " is my name and i reside at " + studHostel +  ".");
        System.out.println("Name of student: " + studName);
        System.out.println("Hall of Residence: " + studHostel);
        //variable for storing integers
        
        int studentAge = 20;      
        double hostelDist = 22.45;
        float height;  
        height =20;
        System.out.println(studentAge);
        System.out.println(height);
        //constant variables
        final int YOB = 2003;// final keyword is used to declare a constant variable
        //....enumerated types
        // enum course {CE, CY, IS}
        course stdCourse = course.CE;
        System.out.println(studName + " is  my name. I offer " + stdCourse + ".");

    }
}