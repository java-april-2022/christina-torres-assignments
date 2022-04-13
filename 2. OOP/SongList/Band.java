package SongList;

import java.util.*;

class Band {
    String name;
    HashMap <String, ArrayList<String>> tracks = new HashMap<String, ArrayList<String>>();
    
    Band(String n, Song s){
        this.name = n;
        this.tracks.put(s.name, s.lyrics);
    }

    // SET
    void addTrack(Song e){
        this.tracks.put(e.name, e.lyrics);
    }

    void getByName(String e){
        System.out.println("*****Searching By Song Name*****");
        if (this.tracks.containsKey(e)) {
            System.out.println("-------------------------------");
            System.out.printf("Lyrics for %s:\n", e.toUpperCase());
            System.out.println("-------------------------------");
            for (String i : this.tracks.get(e)){
                System.out.println(i);
            }
        } else {
            System.out.println("Incorect Song Name :(");
        }
    }

    void getTracks(){
        System.out.printf("\n***Getting Tracks for %s***\n", this.name.toUpperCase());
        for (String i : this.tracks.keySet()) {
            System.out.println("-------------------------------");
            System.out.printf("Song: %s \n", i.toUpperCase());
            System.out.println("-------------------------------");
            System.out.println("Lyrics:");
            for(String j : this.tracks.get(i)) System.out.println(j);
        }
    }
}
