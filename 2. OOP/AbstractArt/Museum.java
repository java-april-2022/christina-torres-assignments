package AbstractArt;
import java.util.*;

class Museum {
    private ArrayList<Art> exhibits = new ArrayList<Art>();
    String name;

    Museum(String n){
        this.name = n + " Museum";
    }

    void getExhibits(){
        System.out.println("----------------------------");
        System.out.println("******* " +name+ " *******");
        System.out.println("----------------------------");
        for(Art i : exhibits) i.viewArt();
    }

    void setExhibit(Art e){
        this.exhibits.add(e);
    }
}
