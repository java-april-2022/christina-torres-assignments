package CafeFun;
import java.util.ArrayList;

class TestCafe {
    public static void main(String[] args){

        // # 1) CREATE OBJECT of class CafeUtil
        //CafeUtil test = new CafeUtil();

        // # 2) CASTE
        // # 2) 10 should return 55
        //System.out.println(test.getStreakGoal(10));

        // # 3) LOOP
        // double[] prices = new double[] {1.50, 1.50};
        // System.out.println(test.getOrderTotal(prices));

        // # 4) ARRAYLIST
        // # 4) display menu
        // test.displayMenu();

        // # 5) ARRAYLIST WITH PARAMS
        // # 5) get pricehcart
        //test. printPriceChart("Soy Latte", 5.50, 3);

        // # 6) ARRAYLIST INPUT ADD
        // # 6) add new customers
        ArrayList<String> customers = new ArrayList<String>();
        customers.add("xtina.codes");
        customers.add("peanut butter");
        CafeUtil.addCustomer(customers);
    }
}
