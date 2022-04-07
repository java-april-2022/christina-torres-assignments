/***************************************
 *                GENERAL               *
 *                RANDOM                *        
 *        Random r1 = new Random();     *
 *  int rpi = r1.nextInt(price.length); *
****************************************/
import java.util.*;

class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double impossibleBurgerP = 8.5;
        double soyLatte = 4.5;
        double[] price = {mochaPrice, impossibleBurgerP, soyLatte};
    
        // Customer name variables (add yours below)
        String customer1 = "Christina";
        String customer2 = "Peanut";
        String customer3 = "James";
        String[] cust = {customer1, customer2, customer3};
    
        // Order completions (add yours below)
        boolean[] isReady = {true, false, true};

        //randoms
        Random r1 = new Random();
        int rpi = r1.nextInt(price.length);
        double randomPrice = price[rpi];
        Random r2 = new Random();
        int rni = r2.nextInt(cust.length);
        String randomName = cust[rni];
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + randomName); 
        System.out.println(randomName + pendingMessage);
        if (isReady[rni]){
            System.out.println(randomName + readyMessage);
            System.out.println(displayTotalMessage + randomPrice);
        } else {
            System.out.println("Still working");
        }

    }
}
