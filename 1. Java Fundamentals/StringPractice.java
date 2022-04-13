import java.util.Date;

public class StringPractice {
    static void getDate(){
        Date date = new Date();
        System.out.printf("Current date in tD is %tD\n", date);
        System.out.printf("Current date in td is %td\n", date);
        System.out.printf("Current date in te is %te\n", date);
        System.out.printf("Current date in ty is %ty\n", date);
        System.out.printf("Current date in tY is %tY\n", date);
        System.out.printf("Current date in tl is %tl\n", date);
        System.out.printf("Current date in tM is %tM\n", date);
        System.out.printf("Current date in tm is %tm\n", date);
        System.out.printf("Current date in tp is %tp\n", date);
    }
    static String func(String x) {
        return String.format("Yay methods are functions %s\n", x);
    }
    
    static void doubleFunc(int x, String y){
        System.out.printf("X = %d and Y = %s\n", x, y);
    }

    public static void main(String[] args){
        //INTROS
        String string1 = "My name is ";
        String string2 = "Christina.";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        System.out.println(string2 + " : " + string2.length());

        //INDEXOF()
        String ninja = "Welcome to Coding Dojo";
        int a = ninja.indexOf("Coding");
        int b = ninja.indexOf("co");
        int c = ninja.indexOf("pizza");
        System.out.printf(".indexOf(a) = %s \n", a);
        System.out.printf(".indexOf(b) = %s \n", b);
        System.out.printf(".indexOf(c) = %s\n", c);
        // c is not found so it is -1

        //TRIM()
        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());

        //.toLowerCase(), .toUpperCase();
        String casePlayA = "HELLO";
        String casePlayB = "world";
        String caps = casePlayB.substring(0,1).toUpperCase() + casePlayB.substring(1);
        System.out.printf("%s.toLowerCase() : %s\n", casePlayA, casePlayA.toLowerCase() );
        System.out.printf("%s.toUpperCase() : %s\n", casePlayB, casePlayB.toUpperCase() );
        System.out.println(caps);

        //EQUALITY
        String sameA = "same string";
        String sameB = "same string";
        System.out.printf( "\"%s\" == \"%s\" : %b\n", sameA, sameB, sameA.equals(sameB) );

        //SUBSTRING
        String findMe = "XTINA.CODES";
        System.out.println(".substring(0,5)");
        System.out.println( findMe.substring(0, 5) );
        
        //CALLING FUNCTIONS
        System.out.println( func("awessommeee") );
        doubleFunc(1, "yolo");
        getDate();

    }
}
