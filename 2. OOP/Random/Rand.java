package Random;
import java.util.*;

public class Rand {
    Random r = new Random();
    char[] alphabet = new char[52];

    Rand(){
        getAlphabet();
    }

    void getAlphabet(){
        // Lowercase Letters(char) 97) =  a - (char) 122 = z
        // Capital letters : (char) 65 = A - (char) 90) = Z
        for (int i=0; i < alphabet.length/2; i++) alphabet[i] = (char) (i+65);
        for (int i=26; i < alphabet.length; i++) alphabet[i] = (char) (i+71);
        System.out.println(alphabet);
    }

    void getTenRolls(){
        System.out.println("Printing out (10) numbers bewtween 1 and 20....");
        // random array with 10 random numbers
        // between 1 and 20 inclusive
        int[] setBetween = new int[10];
        for (int i=0; i < setBetween.length; i++) System.out.println(setBetween[i] = r.nextInt(20));
        // for (int i=0; i < setBetween.length; i++) setBetween[i] = (int) (Math.random() * 21);
        // for (int i : setBetween) System.out.println(i);
    }

    void getPassword(){
        String p = "";
        for (int i=0; i < 10; i++) p += alphabet[r.nextInt(52)];
        System.out.println("Your new password is: " + p);
    }

    void getPassParam(int e){
        String p = "";
        for (int i=0; i < e; i++) p+= alphabet[r.nextInt(52)];
        System.out.printf("Your new passowrd of (%d) characters is: %s\n", e, p);
    }
}
