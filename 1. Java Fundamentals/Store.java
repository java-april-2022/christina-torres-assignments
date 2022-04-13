/*******************************
 *       CLASSES PRACTICE      *
*******************************/
class Store {
    // INSTANCE FIELDS
    String productType;
    double price;
    Store(String x, double y) {
    // CONSTRUCTOR METHOD
        productType = x;
        price = y;
        System.out.println("Constructing store");
        advertise();
    }

    void advertise() {
        System.out.printf("Selling %s", productType);
        System.out.println("\nCome spend some money!");
    }
    void increasePrice(double e){
    //method with parameter
        double p = price;
        price += e;
        double new_price = taxPrice();
        System.out.printf("Incerase price from %.2f + %.2f = %.2f", p, e, new_price);
    }

    double taxPrice(){
    // method using attribute
        return price + price * .08;
        // return type specified
    }

    public static void main(String[] args) {
    // main
        String cookie = "Cookies";
        Store cookieShop = new Store(cookie, 3.25);
        // instantiate class object
        cookieShop.advertise();
        // call cookies.sho method
        cookieShop.increasePrice(1.25);
        // call method with arg
        System.out.println(cookieShop.taxPrice());
    }
}
