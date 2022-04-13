package Zoo;

class Test {
    public static void main(String[] args){
        /**********
        *  HUMAN  *
        **********/
        //Human h = new Human();
        // // superclass methods
        // h.regulateTemp();
        // h.startSleeping();
        // //subclass methods
        // h.goToWork();
        // h.isSleeping();

        /**********
        * GORILLA *
        **********/
        // Gorilla g  = new Gorilla();
        // g.climb();
        // g.showEnergy();

        /**********
        *   BAT   *
        **********/
        Bat b = new Bat();
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.showEnergy();

        //Mammal test = new Mammal();
        // cannot instatntiate becuase it is abstract
        // don't want a random mammal weird thing
        // only want subclasses of mammals
    }
    
}
