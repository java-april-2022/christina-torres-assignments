package SongList;
import java.util.*;

public class Test {
    public static void main(String[] args){
        /***************
        * CREATE SONGS *
        ***************/
        // add 1 song
        ArrayList<String> lyrics1 = new ArrayList<String>();
        lyrics1.add("You're my American Dream");
        lyrics1.add("Give me that red, white, and blue, OH YEA!");
        Song americanDream = new Song("American Dream", lyrics1);

        // // add 2 song
        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("Sooner or later it's over.");
        l2.add("I just don't want to miss you tonight");
        l2.add("I just want you to know who I am");
        Song iris = new Song("Iris", l2);

        // add 3 song
        ArrayList<String> l3 = new ArrayList<String>();
        l3.add("Shouting on the outside.");
        l3.add("What I'm feeling on the inside");
        l3.add("This is my war cry!");
        Song warCry = new Song("War Cry", l3);

        /***************
        * CREATE BAND  *
        ***************/
        Band diamante = new Band("diamante", americanDream);
        //add tracks to band
        diamante.addTrack(iris);
        diamante.addTrack(warCry);
        diamante.getByName("War Cry");
        // //see all tracks
        diamante.getTracks();
    }
}
