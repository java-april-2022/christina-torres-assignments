/*******************************
 *    CONDITIONALS PRACTICE    *
*******************************/
import java.time.*;
import java.util.stream.*;
class Conditionals {
    static void one(){
    // IF STATEMENT SHORTHAND
        boolean data = true;
        if (data) System.out.println("Tis is true");
    }

    static void two(){
    // IF ELSE TERNARY
        boolean data = false;
        String x = (data) ? "Yass Queen" : "Try again";
        System.out.println(x);
    }
    static void fizzbuzz(){
        // for (int i=1; i < 16; i++){
        //     if (i % 5 == 0 & i % 3 == 0){
        //         System.out.println("fizzbuzz");
        //     } else if (i % 5 == 0) {
        //         System.out.println("fizz");
        //     } else if (i%3==0){
        //         System.out.println("buzz");
        //     } else {
        //         System.out.println(i);
        //     }
        //}
        IntStream.rangeClosed(1, 15)
            .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
            //           if i%5 ? (i%7 % i%5? fizzbuzz : i%5 fizz) : (i%7 ? buzz : i!%15, i!%5, i!%7 i)
            .forEach(System.out::println);
    }

    static void getTime(){
    //IF ELSE IF
        // can also do for month
        int hour = LocalDateTime.now().getHour();
        if (hour < 21 & hour >=12) {
            System.out.println(hour);
            System.out.println("The day is young!");
        } else if ( hour < 12 & hour >= 6) {
            System.out.println(hour);
            System.out.println("Good Morning");
        } else {
            System.out.println(hour);
            System.out.println("Get some rest");
        }
    }

    static String getMonth(){
    // SWITCH
        int month = LocalDateTime.now().getMonthValue();
        String x="";
        switch(month) {
        case 1:
            x = "January";
            break;
        case 2:
            x = "February"; 
            break;
        case 3:
            x = "March";
            break;
        case 4:
            x = "April";
            break;
        case 5:
            x = "May"; 
            break;
        case 6:
            x = "June";
            break;
        case 7:
            x = "July";
            break;
        case 8:
            x = "August";
            break; 
        case 9:
            x = "September";
            break;
        case 10:
            x = "October";
            break;
        case 11:
            x = "November";
            break; 
        case 12:
            x = "December";
            break;
        default:
            x = "not found";
            break;
        }
        return x;
    }

    static void truthTables(){
    // TRUTH TABLES
        boolean x = (false || true);
        System.out.printf("(false || true) is %b", x);
        boolean y = !(false || !true);
        System.out.printf("\n!(false || !true) is %b", y);
        boolean foo = true && !(false || !true);
        System.out.printf("\ntrue && !(false || !true) is %b", foo);
    }
    public static void main(String[] args) {
        one();
        two();
        fizzbuzz();
        getTime();
        System.out.println( getMonth() );
        truthTables();
    }
}
