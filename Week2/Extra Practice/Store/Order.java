/**********
* IMPORTS *
**********/
package Store;
import java.util.*;
// import java.util.List;
// import java.util.stream.Collectors;


/******************
* INSTANCE FIELDS *
******************/
class Order {
    String name;
    Double total = 0.00;
    boolean ready;
    List<Item> items;

    /*********************
    * CONSTRUCTOR METHOD *
    *********************/
    Order(String n, Item e){
        this.ready = false;
        this.name = capitalize(n);
        this.items = new ArrayList<Item>();
        this.items.add(e);
    }

    /**********
    * SETTERS *
    **********/
    void addItem(Item e){
        this.items.add(e);

        System.out.printf("Items(%d):\n", items.size());
        for (Item i : this.items) {
            this.total += i.price;
            System.out.println( "$" + i.price + " - " + capitalize(i.name) );
        }
        System.out.printf("Total: $%.2f\n", total);
        // List<String> names = items.stream().map(x->x.name).collect(Collectors.toList());
        // System.out.println(names);
    }

    void setReady(){
        this.ready = true;
        System.out.printf("%s, order up!\n", name.toUpperCase());
    }

    /**********
    * GETTERS *
    **********/
    void getStatus(){
        status(this.name);
    }

    void getObjectMethods() {
        System.out.println("Class: " + this.getClass());
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.name.toString());
        System.out.println("Equals: " + this.name.equals("lalala"));
    }
    
    /*****************
    * STATIC METHODS *
    *****************/
    static String capitalize(String e){
        return e.substring(0,1).toUpperCase() + e.substring(1);
    }

    /******************
    * PRIVATE METHODS *
    ******************/
    private void status(String e){
        String stat = (!this.ready) ? String.format("%s, a little logner...", e) :  "Order ready!";
        System.out.println(stat);
    }
}