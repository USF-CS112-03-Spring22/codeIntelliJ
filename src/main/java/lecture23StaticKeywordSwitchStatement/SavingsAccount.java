package lecture23StaticKeywordSwitchStatement;

/** Same as in lecture 17 except for the commented code that shows that we cannot
 * override withdraw or deposit because they are final in the parent class.
 * Demonstrates inheritance. Class SavingsAccount extends class BankAccount */
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, String owner, double interestRate) {
        super(balance, owner); // calling the parent's constructor
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        setBalance(getBalance() + interestRate * getBalance()); // note that we cannot access balance directly
    }

    // If you try to override withdraw or deposit, the code won't compile,
    // since the methods are declared as final
    /*@Override
    public final void withdraw(double amount) throws InsufficientFundsException {
        // something
    } */

    @Override
    public String toString() {
        return super.toString() + " Interest Rate: " + interestRate;
        // super.toString() calls the toString() method of the parent class
    }
}
