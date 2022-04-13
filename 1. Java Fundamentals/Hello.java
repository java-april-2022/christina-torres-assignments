/*******************************
 *      GENERAL PRACTICE      *
*******************************/
class Hello{
    public static void main(String[] args){
        final String name = "Christina";
        int age = 30;
        String hometown = "Chesapeake, Va";
        System.out.println("My name is " + name);
        System.out.println("I am " + age);
        System.out.println("My hometown is " + hometown);

        boolean isRaining = true;
        boolean isCold = true;
        if(isRaining & isCold){
            System.out.println("Fizzbuzz umbrella and coat");
        } else if (isRaining){
            System.out.println("Bring an umbrella");
        } else if(isCold){
            System.out.println("Wear a coat"); 
        } else {
            System.out.println("Go explore!");
        }
    }
}