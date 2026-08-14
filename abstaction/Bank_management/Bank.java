


abstract class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber,double balance ){
        this.accountHolder =  accountHolder;
        this.accountNumber =  accountNumber;
        this. balance = balance;
    }

    void displayAccount(){
        System.out.println("Account Holder :" + accountHolder );
         System.out.println("Account Number :" + accountNumber);
          System.out.println("Balance :" + balance);
    }

     void deposit(double amount){
        balance =  balance +  amount;
     }

    abstract void withdraw(double amount);

     double getBalance(){
      return balance;
    }

    void setBalance(double amount){
        this.balance= amount;
    }
}

class SavingAccount extends BankAccount{
    SavingAccount(String accountHolder, int accountNumber, double balance) {
    super(accountHolder, accountNumber, balance);
}
    void withdraw(double amount){
    if (getBalance() >= amount){
      setBalance(getBalance() - amount);
        System.out.println("Total Balance : " + getBalance());
       }
    else {
         System.out.println("insufficient balance" );
    }
}}

class CurrentAccount extends BankAccount{
   CurrentAccount (String accountHolder, int accountNumber, double balance) { 
   super(accountHolder, accountNumber, balance);
   }

   void withdraw(double amount){
     double overdraft_limit = 1000;
     double max = getBalance() + overdraft_limit;
    if (max >= amount){
        setBalance(getBalance() - amount);
         System.out.println("Total Balance : " + getBalance());
   }
    else {
         System.out.println("insufficient balance" );
    }
    }
}

public class Bank {
    public static void main(String[] args) {

        // Runtime Polymorphism, create reference
        BankAccount account;

        // Savings Account
        account = new SavingAccount("Ayisha", 101, 5000);

        System.out.println("----- SAVINGS ACCOUNT -----");
        account.displayAccount();

        account.deposit(1000);

        System.out.println("After Deposit:");
        account.displayAccount();

        account.withdraw(2000);

        System.out.println();


        // Current Account
        account = new CurrentAccount("Rahul", 102, 5000);

        System.out.println("----- CURRENT ACCOUNT -----");
        account.displayAccount();

        account.deposit(1000);

        System.out.println("After Deposit:");
        account.displayAccount();

        // Within overdraft limit
        account.withdraw(5500);

        // Exceeds overdraft limit
        account.withdraw(6500);
    }
}
