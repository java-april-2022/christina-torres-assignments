
/********************************************************************
 *                             ARRAYS                                *
 *                          -FIXED SIZE                              *
 *                     - CANNOT ADD OR REMOVE                        *
 *                     import java.util.Arrays                       *
 *                    String[] arr = {"x", "y"};                     *
 *                      Empty == Sting[] arr;                        *
 *                            METHOD                                 *
 *                Print all : Arrays.toString(arr);                  *
 *                             LOOP                                  *      
 * Print individual: for(String i : topics) {System.out.println(i);} *
 *                          INITIALIZE                               *
 *                 class Class { String[] arr}                       *
 *           Class object = new Class("arg1", "arg2")                *
 *         public Constructor(String param1, String param2)          *
 *               arr = new String[] {param1, param2}                 *
*********************************************************************/
import java.util.Arrays;

class ArrayPlay {
    String[] topics = {"declare", "add value", "initialize"};
    String[] logo;
    // String[] logo = new String[2];

    ArrayPlay(String x, String y){
        logo = new String[] {x, y};
        System.out.printf("*I am in the consttuctor: %s.*\n", Arrays.toString(topics));
    }

    void greeting(){
        System.out.printf("Topics (%d):\n", topics.length);
        for(String i : topics) System.out.println("- " + i);
        System.out.printf("Logo (%d):\n", logo.length);
        for(String i : logo) System.out.println("- " + i);
        System.out.printf("Favorite topic: %s array.", topics[0]);
    }

    public static void main(String[] args){
        ArrayPlay xtina = new ArrayPlay("xtina", ".codes");
        xtina.greeting();
        // xtina.getRatings();
    }
}
