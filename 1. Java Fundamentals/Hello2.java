// import java.util.*;
// import java.util.Scanner;
public class Hello2{
        public static void main(String[]args){
        System.out.println("The main method executes the tasks of the class");
        /* AREA OF A CIRCLE
           a = radius * radius * pi
        */ 
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a radius decimals");
        // double radius = input.nextDouble();
        double radius = 3.2;
        // input.close();
        double area = radius * radius * 3.14;
        System.out.println(area);
        /*
        DISPLAY TIME
        minutes = seconds / 60
        */
        int seconds = 503;
        int minutes = seconds / 60;
        int remainingMinutes = seconds % 60;
        System.out.println("Seconds: " + seconds + "Minutes: " + minutes + "Remaining Minutes: " + remainingMinutes);
        /*
        MATH.POW
        doesnt need to be imported
        */
        System.out.println( "Math.pow(2,3): " + Math.pow(2,3) );
        /*
        Scientific Notation
        1.23 * 10^-1 = 1.23E2 or 1.23E + 2
        also,
        Can change numbers to float and double
        WITH F AND D
        */
        double scientific = 1.23E+2;
        scientific = 1.23E2D;
        System.out.println("1.23E2 : " + scientific);
        /*
        Fahrenheight To Celsius
        */
        double fahr = 100;
        double celsius = (5.0 / 9) * (fahr - 32);
        System.out.println("Fahrenheight: " + fahr + " = " + celsius + " Celsius.");
    }
}

