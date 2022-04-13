package Bank;
import java.util.*;

class Account {
    static String bankName = "First National North Pole";
    static int count = 0;
    static double totalBal = 0;
    static ArrayList<Account> accounts = new ArrayList<Account>();
    String user;
    double checkingBal;
    double savingBal;
    long checkingNum;
    long savingNum;

    // CONSTRUCTOR
    Account(String n){
        this.user = n;
        this.checkingBal = 0.00;
        this.savingBal = 0.00;
        this.checkingNum = setAccountNum();
        this.savingNum = setAccountNum();
        updateGlobally(this);
        System.out.printf("Welcome, %s!\n", this.user.toUpperCase());
    }

    // STATIC METHODS
    static void updateGlobally(Account e){
        totalBal += e.checkingBal + e.savingBal;
        count += 2;
        accounts.add(e);
        
    }

    static int getCount(){
        System.out.printf("* There are (%d) accounts at %s.\n", count, bankName);
        System.out.printf(" - The total balance is: $%.2f. \n", totalBal);
        System.out.printf( "* There are/is (%d) user(s):\n", accounts.size() );
        for (Account i : accounts) System.out.println(" - " + i.user);
        return count;
    }

    // GETTERS
    void getCheckBal(){
        System.out.printf("%s, your checking account balance is: %.2f.\n", this.user, this.checkingBal);
    }

    void getSavingBal(){
        System.out.printf("%s, your savings account balance is: $%.2f.\n", this.user, this.savingBal);
    }

    void getUserBal(){
        System.out.printf("%s, your total balance is $%.2f\n", this.user, (this.checkingBal + this.savingBal));
    }

    void getAccountNum(String e){
        if ( e.equals("checking") ) {
            System.out.printf("%s your checking account number is: %d.\n", this.user, this.checkingNum);
        } else if ( e.equals("saving") ) {
            System.out.printf("%s your saving account number is: %d.\n", this.user, this.savingNum);
        } else {
            System.out.println("Invid entry to acccess account number");
        }

    }

    // SETTERS
    void setUser(String e){
        this.user = e;
    }

    void deposit(String x, double e){
        if ( x.equals("checking") ){
            setCheckingDeposit(e);
        } else if ( x.equals("savings") ) {
            setSavingDeposit(e);
        } else {
            System.out.println("Incorrect account for deposit :(");
        }
    }
    void setCheckingDeposit(double e){
        this.checkingBal += e;
        totalBal += e;
        System.out.println("Deposit Successful!");
        System.out.printf("New balance: $%.2f.\n" , this.checkingBal);
    }

    void setSavingDeposit(double e){
        this.savingBal += e;
        totalBal += e;
        System.out.println("Deposit Successful!");
        System.out.printf("New balance: $%.2f.\n" , this.savingBal);
    }

    void withdraw(String x, double e){
        if ( x.equals("checking") ){
            setCheckingWithdraw(e);
        } else if ( x.equals("saving") ) {
            setSavingWithdraw(e);
        } else {
            System.out.println("Incorrect account for deposit :(");
        }
    }

    void setCheckingWithdraw(double e){
        if ((this.checkingBal - e) >= 0){
            this.checkingBal -= e;
            totalBal -= e;
            System.out.println("Witdraw Successful!");
            System.out.printf("New balance: $%.2f.\n" , this.checkingBal);
        } else {
            System.out.println("Withdraw unsuccessful");
        }

    }

    void setSavingWithdraw(double e){
        if ((this.savingBal - e) >= 0){
            this.savingBal -= e;
            totalBal -= e;
            System.out.println("Witdraw Successful!");
            System.out.printf("New balance: $%.2f.\n" , this.savingBal);
        } else {
            System.out.println("Withdraw unsuccessful");
        }
    }

    private long setAccountNum(){
        return (long) (Math.random()*Math.pow(10,10));
    }

    public static void main(String[] args){
        Account santa = new Account("Santa");
        santa.deposit("checking", 10);
        santa.withdraw("saving", 10);
        santa.getUserBal();
        santa.withdraw("checking", 10);
        santa.getAccountNum("checking");
    }
}
