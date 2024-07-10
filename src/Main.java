public class Main {
    public static void main(String[] args) {
        ///For Bank Account
        BankAccount bankAccount = new BankAccount(20000.0);
        System.out.println("Current Balance is=>" + bankAccount.getBalance());
        bankAccount.depositBalance(2000.0);
        System.out.println("After Deposit Balance is =>"+bankAccount.getBalance());
        bankAccount.withdraw(1000.0);
        System.out.println("After Withdraw Balance is =>"+bankAccount.getBalance());
        //For

    }

}
//Class of BankAccount which have instance variable and members deposiit and wi
class BankAccount {
    private double balance;
///Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
// Return Updated balance
    public double getBalance() {
        return balance;
    }
/// Deposit balance aUsed for Add or Deposit Balance to the Account
    public void depositBalance(double amount) {
    if (amount>0)
    {
        balance += amount;
    }
    }

//Withdraw method use for the withdrawing the balance
    public void withdraw(double amount) {
        if (amount > 0&&amount<=balance) {
            balance-=amount;
        }
    }




}