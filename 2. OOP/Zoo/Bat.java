package Zoo;

class Bat extends Mammal {
    Bat(){
        setEnergy(200);
    }

    int fly(){
    int energy = getEnergy();
    int e = (energy - 50 >= 0) ? -50 : 0;
    String status = (energy != (energy-e)) ? "Flying around the cave." : "Not enough energy";
    System.out.println(status);
    return setEnergy(e);
    }

    int attackTown(){
        int energy = getEnergy();
        int e = (energy - 100 >= 0) ? -100 : 0;
        String status = (energy != (energy-e)) ? "TOWN ON FIREE" : "Not enough energy";
        System.out.println(status);
        return setEnergy(e);
    }

    int eatHumans(){
        System.out.println("Bite size human");
        return setEnergy(25);
    }
}
