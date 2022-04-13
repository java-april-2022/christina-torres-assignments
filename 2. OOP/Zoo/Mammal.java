package Zoo;

abstract class Mammal {
    private boolean sleeping = false;
    private int energy = 100;
    // private variables need getters and setters to be seen

    //GETTERS
    boolean getSleeping(){
        return sleeping;
    }

    void regulateTemp(){
        System.out.println("My temp is just right now.");
    }

    int getEnergy(){
        return energy;
    }

    void showEnergy(){
        System.out.println("Energy: " + energy);
    }

    //SETTERS
    void startSleeping(){
        this.sleeping = true;
        this.energy = 100;
        System.out.println("zZzZ");
    }

    int setEnergy(int e){
        return this.energy += e;
    }

}
