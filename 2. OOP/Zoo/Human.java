package Zoo;

class Human extends Mammal{
    void goToWork(){
        System.out.println("I'm going to work");
    }

    void isSleeping(){
        String e = (getSleeping()) ? "Is Sleeping" : "Not Sleeping";
        System.out.println(e);
    }

}
