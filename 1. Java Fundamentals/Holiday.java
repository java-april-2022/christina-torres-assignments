/*************************************************************
 *                          ARRAY LIST                       *
 *                    -Java's version of list                *
 *                   import java.util.ArrayList              *
 *                        DECLARE EMPTY                      *
 *                    ArrayList<String> name                 *
 *                       INITIALIZE EMPTY                    *
 *                name = new ArrayList<String>()             *    
 *                 BOTH DECLARE AND INTITILIZE               *
 *     ArrayList<String> name = new ArrayList<String>();     *
 *                         METHODS                           *
 *              ADD VALUE: name.add("value");                * 
 *          READ name.get("value") or name.get(i#)           *
 *      DELETE name.remove("value")  or name.remove(#)       *
 *                   LENGTH: name.size());                   *
 *                         LOOP                              *
 * PRINT for (String i : greeting) { System.out.print(i); }  *
**************************************************************/

import java.util.ArrayList;
class Holiday {
    //class variables
    ArrayList<String> greeting;
    //DECLARE ARRAY

    Holiday(String w, String x, String y, String z){
    //constructor, add value to variables 
    greeting = new ArrayList<String>();
    //INITIALIZE ARRAY
    greeting.add(w);
    // arrList.add(param);
    greeting.add(x);
    greeting.add(y);
    greeting.add(0, z);
    // arrList.add(i#, param);
    greeting.remove("delete");
    // arrList.remove("value");
    // or
    // gretting.remove(i#);
    //ARRLIST.CLEAR()
    //ARRLIST.SET(I#, VALUE);
    System.out.println("Constructor: " + greeting);
    }
    static void objArrList(){
        ArrayList<String> toAdd = new ArrayList<String>();
        toAdd.add("winning");
        toAdd.add("YAAASSS");

        ArrayList<Object> objListArr = new ArrayList<Object>();
        objListArr.add(10);
        objListArr.add("gotchya");
        objListArr.add(toAdd);
        objListArr.add(12.5);
        System.out.println("\n" + objListArr);

    }
    void getGreeting(){
        greeting.set(2, greeting.get(2).toUpperCase());
        //arrList.set(i#, "value");
        System.out.printf("Which holiday? %s @ index %d\n", greeting.get(2), greeting.indexOf("EASTER"));
        //arrList.get(i#);
        System.out.printf("Greeting (%d):\n", greeting.size());
        //arrList.size();
        for (String i : greeting) System.out.print(i.toUpperCase() + " ");
    }


    public static void main(String[] args){
    Holiday easter = new Holiday("delete", "Happy", "Easter", "Peeps,");
    // initialize class object with arguments
    easter.getGreeting();

    ArrayList<String> kudos = new ArrayList<String>();
    // BOTH DECLARE AND INITIALIZE
    kudos.add("Be");
    kudos.add("hOppy!");
    System.out.printf("\nKudos(%d): \n%s", kudos.size(), kudos.toString());

    Holiday.objArrList();
    }
}
