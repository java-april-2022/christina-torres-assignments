package SongList;
import java.util.*;

public class Song {
    String name;
    ArrayList<String> lyrics = new ArrayList<String>();

    Song(String n, ArrayList<String> l){
        name = n;
        lyrics = l;
    }
}
