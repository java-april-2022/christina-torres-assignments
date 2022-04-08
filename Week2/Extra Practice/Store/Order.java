package Store;
import java.util.*;
// import java.util.List;
// import java.util.stream.Collectors;

class Order {
    String name;
    Double total = 0.00;
    boolean ready = false;
    ArrayList<Item> items = new ArrayList<Item>();

    Order(String n, Item e){
        name = n.substring(0, 1).toUpperCase() + n.substring(1);
        items.add(e);
    }

    void addItem(Item e){
        items.add(e);

        System.out.printf("Items(%d):\n", items.size());
        for (Item i : items) {
            total += i.price;
            System.out.println(i.name.substring(0, 1).toUpperCase() + i.name.substring(1));
        }
        System.out.printf("Total: $%.2f\n", total);
        // List<String> names = items.stream().map(x->x.name).collect(Collectors.toList());
        // System.out.println(names);
    }

    void setReady(){
        ready = true;
        System.out.printf("%s, order up!\n", name.toUpperCase());
    }

    void getStatus(){
        String status = (!ready) ? String.format("%s, your is not ready.", name) :  "Order has been ready.";
        System.out.println(status);
    }
}