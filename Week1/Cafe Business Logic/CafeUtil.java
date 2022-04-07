import java.util.*;
class CafeUtil {
    // CafeUtil(){

    // }

    static Integer getStreakGoal(int numWeeks){
        int result = 0;
        for (int i = 1; i < numWeeks+1; i++){
            result += i;
        }
        return result;
    }

    static double getOrderTotal(double[] prices){
        double result = 0;
        for (double i : prices) result += i;
        return result;
    }

    static void displayMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        for (String i : menu) System.out.printf("%d %s\n", menu.indexOf(i), i);
    }

    static void printPriceChart(String product, double price, int maxQuantity){
        ArrayList<Double> priceChart = new ArrayList<Double>();
        for (int i = 1; i <= maxQuantity; i++) priceChart.add(price * i);
        System.out.println(product);
        for(Double i : priceChart) System.out.printf("%d - $%.2f\n", priceChart.indexOf(i), i);
    }

    static void addCustomer(String e){
        ArrayList<String> customers = new ArrayList<String>();
        customers.add(e);
        System.out.printf("Hello, %s\n", e.toUpperCase());
    }
    public static void main(String[] args){
    }
}
