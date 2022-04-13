package Alfred;
import java.util.Date;
import java.util.Random;
public class AlfredQuotes {
    
    String basicGreeting() {
    // datatype needs return
        return "Hello, lovely to see you. How are you?";
    }
    
    String guestGreeting(String name) {
    // parameter
        return String.format("Happy Easter %s !", name);
    }
    
    String dateAnnouncement() {
        Date date = new Date();
        return String.format("Today is %tB ..." , date);
    }
    
    String respondBeforeAlexis(String conversation) {
        String[] quotes = {"We believe in the easter bunny", "Alot can happen in three days", "Easter Bunny, Stop here!"};
        Random rand = new Random();
        System.out.println( quotes[rand.nextInt(quotes.length)] );
        return conversation;
    }
}

