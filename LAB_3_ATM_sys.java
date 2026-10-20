// GETTER SETTER
// STATIC METHOD
class Account{
    private String accountNumber;
    private int pin;
    private double balance;
    public Account(String acccountNumber,int pin,double balance){
        this.accountNumber=acccountNumber;
        this.pin=pin;
        this.balance= balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited:" + amount);
        }
    }
    public void withdraw(double amount,int enteredPin){
        if(enteredPin!=this.pin){
            System.out.println("failed");
            return ;
        }
        if(amount>0 && amount<=balance){
            balance=-amount;
            System.out.println("successfully withdraw"+amount);
        }else{
            System.out.println("transaction failed");
        }

    }
    public void checkbalance(){
        System.out.println(+balance);
    }
    public void changePIN(int oldpin,int newpin){
        if(this.pin==oldpin){
            this.pin=newpin;
            System.out.println("successfully changed");
        }else{
            System.out.println("failed not changed");
        }
    }
}
public class LAB_3_ATM_sys {
    public static void main(String[] args) {
        Account acc1 = new Account("1001", 123,10000);
        acc1 .deposit(100000);
        acc1.withdraw(1000,123);
        // acc1.checkbalance();
    }
}
