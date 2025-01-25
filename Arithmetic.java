public class Arithmetic {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 30;
        double dec1 = 2.5;
        double dec2 = 3.5;
        
        //addition
        System.out.println( "integer + integer" + " = " + (num1 + num2 ));
        System.out.println( "decimal + decimal" + " = " +  (dec1 + dec2 ));
        System.out.println( "decimal + integer" + " = " +  (dec1 + num2 ));

        System.out.println ("********************************************************");
        System.out.println ("********************************************************");
        //subtraction
        System.out.println( "integer - integer" + " = " + (num1 - num2 ));
        System.out.println( "decimal - decimal" + " = " +  (dec1 - dec2 ));
        System.out.println( "decimal - integer" + " = " +  (dec1 - num2 ));

        System.out.println ("********************************************************");
        System.out.println ("********************************************************");
        //multiplication
        System.out.println( "integer * integer" + " = " + (num1 * num2 ));
        System.out.println( "decimal * decimal" + " = " +  (dec1 * dec2 ));
        System.out.println( "decimal * integer" + " = " +  (dec1 * num2 ));

        System.out.println ("********************************************************");
        System.out.println ("********************************************************");
        //division
        System.out.println( "integer / integer" + " = " + (num1 / num2 ));
        System.out.println( "decimal / decimal" + " = " +  (dec1 / dec2 ));
        System.out.println( "decimal / integer" + " = " +  (dec1 / num2 ));

        System.out.println ("********************************************************");
        System.out.println ("********************************************************");
        //remainder
        System.out.println( "integer % integer" + " = " + (num1 % num2 ));
        System.out.println( "decimal % decimal" + " = " +  (dec1 %dec2 ));
        System.out.println( "decimal % integer" + " = " +  (dec1 % num2 ));

    }
}
