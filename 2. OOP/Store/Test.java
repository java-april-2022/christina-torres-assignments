package Store;
public class Test {

    public static void main(String[] args) {
        // Menu items
        Item teaLatte = new Item("tea", 7.75);
        Item cookie = new Item("cookie", 4.35);
        Item banana = new Item("banana", 2.00);
        Item capp = new Item("cappuccino", 2.00);
        Order.menu.add(teaLatte);
        Order.menu.add(cookie);
        Order.menu.add(banana);
        Order.menu.add(capp);
        Order.seeMenu();


        // Order variables
        Order order1 = new Order("tina", teaLatte);
        order1.addItem(cookie);
        Order order2 = new Order("peanut", cookie);
        order1.getStatus();
        order1.setReady();
        order2.getObjectMethods();
    }

}
