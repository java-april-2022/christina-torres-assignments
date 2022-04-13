/************************************************************************
 *                                HASMAPS                                *
 *                      -Java's version of Dictionary                    *
 *                        import java.util.HashMap                       *
 *                            DECLARE EMPTY                              *
 *                HashMap<key datatype, value datatype> name;            *
 *                            INITIALIZE EMPTY                           *
 *                   name = new HashMap<String, String>()                *
 *                       BOTH DECLARE AND INTIALIZE                      *
 *     HashMap<String, Integer> people = new HashMap<String, Integer>(); *
 *                                METHODS                                *
 *                    ADD VALUE: hm.put("key", "value");                 * 
 *                 name.remove("value")  or name.remove(#)               *
 *                     LENGTH: name.keySet().size());                    *
 *                                 LOOP                                  *      
 *   PRINT KEYS: for(String i : name.keySet()) {System.out.println(i);}  *
 * PRINT VALUES: for (String i : name.values()) {System.out.println(i);} *
 *                  PRINT ALL: System.out.println(name)                  *
*************************************************************************/
import java.util.HashMap;

public class Data {
    // class variables
    HashMap<String, Object> capitalCities;
    //DECLARE HashMap<key datatype, value datatype> name;

    Data() {
        // constructor class
        capitalCities = new HashMap<String, Object>();
        //INITIALIZE
        capitalCities.put("England", "London");
        //ADD VALUE
        //hm.put("key", "value");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.putIfAbsent("num", 5);
        capitalCities.computeIfPresent("num",
                                            (key, val) -> (int)val + 5 );

    }

    void getInfo() {
        System.out.println(capitalCities);
        System.out.printf("capitalCities Keys(%d):\n", capitalCities.keySet().size());
        for (String i : capitalCities.keySet()) {
            System.out.println("- " + i);
        }
        System.out.printf("capitalCities Values(%d):\n", capitalCities.values().size());
        for (Object i : capitalCities.values()) {
            System.out.println("- " + i);
        }
    }

    public static void main(String[] args) {
        Data countries = new Data();
        countries.getInfo();

        HashMap<String, Object> people = new HashMap<String, Object>();
        // BOTH DECLARE AND INITIALIZE HASHMAP
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        people.remove("Steve");
        //people.clear();
        for (String i : people.keySet()) {
            System.out.printf("key: %s , value: %s \n", i, people.get(i).toString() );
        }
    }
}
