package lecture28GUIInnerClasses;

public class BankAccount {
    private Money balance;

    public BankAccount(int dollars, int cents) {
        balance = new Money(dollars, cents);
    }
    public String getBalance() {
        return "Bank Account: " + balance.getAmount();
    }

    // Other methods now shown here: withdraw and deposit

    // other methods of BankAccount
    public class Money {
        private int dollars;
        private int cents;
        Money(int d, int c) {
            dollars = d;
            cents = c;
        }
        public String getAmount() {
            // ... computes a string representation of money
            return "$" + dollars + "." +cents;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(600, 34);
        System.out.println(account.getBalance());

        // What if we want to create an object of the inner class Money?
        BankAccount.Money moneyObject = account.new Money(40, 6);
        System.out.println(moneyObject.getAmount());


    }
}

