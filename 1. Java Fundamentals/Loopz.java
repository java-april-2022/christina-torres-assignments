import java.util.*;
class Loopz {
    int diceNum;
    static Random rand = new Random();
    String name;
    
    Loopz(String x){
        this.diceNum = getRoll();
        this.name = x;
    }

    static Integer getRoll(){
        int dieRoll = rand.nextInt(7); // exclusive
        return dieRoll;
    }

    void checkPassCode(){
        int passcode = 12;
        int attempts = 1;
        int gen = rand.nextInt(13);
        while (gen != passcode & attempts < 5){
            System.out.println("Looking for " + passcode + "!");
            System.out.println(gen + ", Try Again..");
            System.out.println("Attempts: " + attempts);
            attempts += 1;
            gen = rand.nextInt(13);
        }
        String end = (attempts < 5) ? String.format("(%d) %s GOT IT!\nAttempts: %d", passcode, name, attempts) : "MAX ATTEMPTS PLAY AGAIN";
        System.out.println(end);
    }

    void cupOfTea(int t){
        if (t >= 5) System.out.printf("%s, too much tea!", name.toUpperCase());

        while(t < 5){
            System.out.printf("%s has %d more cups remaining...\n*drinks tea*\n", name, 5 - t);
            t += 1;
        }
    }

    void checkArr(){
        String[] arr = {"You", "are", "awesome"};

        // for (int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for (String i : arr) System.out.println(i);
    }

    void checkArrList(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("You!");
        arrList.add("are!");
        arrList.add("awesome!");
        // for (int i=0; i < arrList.size(); i++){
        //     System.out.println(arrList.get(i));
        // }
        for (String i : arrList) System.out.println(i);
    }

    void continYou(){
        String[] arr = {"Duck", "Duck", "Goose"};
        for (String i : arr){ //FOR EACH LOOP
            if (i != "Goose") {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    void forEachLoop(){
        int[] arr = {1,2,3,4,5};
        int largest = 0;
        for (int i : arr) {
            if (i > largest) {
            largest = i;
            }
        }
        System.out.print(largest);
    }

    void removeArrLst(){
        ArrayList<String> arrLst = new ArrayList<String>();
        arrLst.add("apple");
        arrLst.add("ant");
        arrLst.add("sando");
        arrLst.add("ant");
        for (int i = 0; i < arrLst.size(); i++) {
            if (arrLst.get(i).equals("ant")){
                arrLst.remove( arrLst.get(i) );
            }
        }
        System.out.println(arrLst);
    }

    public static void main(String[] args){
        Loopz xtina = new Loopz("xtina.codes");
        xtina.removeArrLst();
        // xtina.forEachLoop();
        // xtina.continYou();
        // xtina.checkArrList();
        // xtina.checkArr();
        // xtina.cupOfTea(4);
        // xtina.checkPassCode();
        // System.out.println(Loopz.getRoll());
        // System.out.println(xtina.diceNum);
    }
}
