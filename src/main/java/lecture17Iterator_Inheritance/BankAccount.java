package lecture17Iterator_Inheritance;

/** Class BankAccount. Demonstrates how to throw a custom exception, InsufficientFundsException.
 *  Modified from the following example:
 *  https://www.ibm.com/developerworks/community/blogs/738b7897-cd38-4f24-9f05-48dd69116837/entry/declare_your_own_java_exceptions
 */
public class BankAccount implements Comparable<BankAccount> {
    private double balance;
    private String owner;

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        // If there is not enough money in the account to withdraw this amount, throw an InsufficientFundsException
        if (amount > balance)
            throw new InsufficientFundsException(amount, "You do not have enough funds in your account.");
        this.balance -= amount;
    }

    public String toString() {
        return "Owner: " + owner + ", Balance: " + balance;
    }

    public int compareTo(BankAccount otherAccount) {
        if (Math.abs(this.balance - otherAccount.balance) < 0.0001)
            return 0;
        else
            if (this.balance < otherAccount.balance)
                return -1;
            else
                return 1;
    }
}


