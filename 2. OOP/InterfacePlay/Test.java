package InterfacePlay;

public class Test {
    public static void main(String[] args){
        Heater test = new Heater(65);
        System.out.println(test.checkPluggedIn());
        test.plugIn();
        System.out.println(test.checkPluggedIn());
        test.hasPower();
    }

}
