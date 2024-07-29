package encapsulation;

public class BankAccount
{
    int balance;
    String account_number;

    public BankAccount(int balance, String account_number)
    {
        this.balance = balance;
        this.account_number = account_number;
    }

    public void withdraw(int amount)
    {
        System.out.println("Withdraw request of "+ amount);
        if (amount > balance)
        {
            System.out.println("Insufficient funds");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void deposit(int amount){
        this.balance+=amount;
    }
    public int get_balance(){
        return balance;
    }
}
