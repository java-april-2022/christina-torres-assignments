package CareSoft;

abstract public class User {
    protected Integer id;
    protected int pin;

    User(Integer i) {
        this.id = i;
    }

    //GETTERS
    Integer getId() {
        return id;
    }
    int getPin() {
        return pin;
    }

    // SETTERS
    void setId(int i) {
        this.id = i;
    }
    void setPin(int p) {
        this.pin = p;
    }

}
