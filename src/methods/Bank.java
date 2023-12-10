package methods;

public class Bank {

    static int currentBalance = 1000;
                                                    // void is a reserve word in java
    public  static void greetcustomer(){

        System.out.println(" Welcome to SBI Bank application ");
    }

    public void deposite(int amount){
        currentBalance = currentBalance + amount;
        System.out.println(" Amount is deposited successfully");
    }
    public static void withdrawl(int amount){
        currentBalance = currentBalance - amount;
        System.out.println(" Amount withdrawl successfully ");
    }
    public int getbalance(){
        return currentBalance;
    }

    public static void main (String[] args ){
greetcustomer();
Bank bn = new Bank();
bn.deposite(400);
bn.getbalance();
    }
}
