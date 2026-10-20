class BankAccount{
    double accountNumber;
    String accountHolder;
    double balance;
    // double deposit;
    public BankAccount(double accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void deposit(double ammount){
            balance = balance +ammount;
            System.out.println("deposited::"+ammount);
        }
    void withdraw(double ammount){
        if(ammount<=balance){
            balance = balance - ammount;
            System.out.println("withdrawn::"+ammount);
        }else{
            System.out.println("insufficient balance");
        }
        
    }
    void displayBalance(){
        System.out.println("accountNumber::"+accountNumber);
        System.out.println("accountHolder::"+accountHolder);
        System.out.println("balance::"+balance);
    }
}
public class LAB_2_Bank_account_sys {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101,"ali",5000);
        BankAccount b2 = new BankAccount(102,"harry",6000);
        b1.displayBalance();
        b1.deposit(1000);
        b1.withdraw(2000);

        b1.displayBalance();

System.out.println("account 2 transaction");
        b2.displayBalance();
        b2.deposit(1000);
        b2.withdraw(2000);

        b2.displayBalance();
    }
}
