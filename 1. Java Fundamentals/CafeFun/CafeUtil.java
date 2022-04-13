package CafeFun;
import java.util.*;

class CafeUtil {
    double result;

    CafeUtil(){
        result = 0;
    }

    Integer getStreakGoal(int e){
        int resultCast = (int)result;
        for (int i = 1; i < e+1; i++){
            resultCast += i;
        }
        return resultCast;
    }

    double getOrderTotal(double[] e){
        double result = 0;
        for (double i : e) result += i;
        return result;
    }

    void displayMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        for (String i : menu) System.out.printf("%d - %s\n", menu.indexOf(i), i);
    }

    void printPriceChart(String product, double price, int maxQuantity){
        ArrayList<Double> priceChart = new ArrayList<Double>();
        for (int i = 1; i <= maxQuantity; i++) priceChart.add(price * i);
        System.out.println(product);
        for(Double i : priceChart) System.out.printf("%d - $%.2f\n", priceChart.indexOf(i), i);
    }

    static void addCustomer(ArrayList<String> e){
        System.out.println("New Customers:");
        for (String i : e) System.out.println( i.toUpperCase() );
    }
    public static void main(String[] args){
    }
}
