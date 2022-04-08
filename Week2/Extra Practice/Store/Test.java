package Store;
public class Test {

    public static void main(String[] args) {
        // Menu items
        Item tea = new Item("tea", 7.75);
        Item cookie = new Item("cookie", 4.35);

        // Order variables
        Order order1 = new Order("tina", tea);
        order1.addItem(cookie);
        Order order2 = new Order("peanut", cookie);
        order1.getStatus();
        order1.setReady();
        order2.getObjectMethods();
    }

}
