package Random;

public class Test {
    public static void main(String[] args){
        // // INITIATE RANDOM CLASS OBJECT
        // Random rand = new Random();

        // // .next()
        // int rand1 = rand.nextInt(1000);
        // System.out.println(rand1);

        // // .next() WITH START
        // int rStart = rand.nextInt(5,10);
        // System.out.println(rStart);

        // boolean foo = rand.nextBoolean();
        // System.out.println(foo);

        // //MATH.RANDOM() -> RETURNS DOUBLE
        // System.out.println( (int) (Math.random()*100) );


        /****************
        * ASSIGNMENT QS * 
        ****************/
        Rand test = new Rand();
        test.getTenRolls();
        test.getPassword();
        test.getPassParam(3);
    }
}
