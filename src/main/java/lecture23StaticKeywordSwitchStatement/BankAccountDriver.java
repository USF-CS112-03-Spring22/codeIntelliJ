package lecture23StaticKeywordSwitchStatement;

public class BankAccountDriver {
    public static void main(String[] args) {
        //BankAccount ba = new BankAccount(100, "Kiran");

        SavingsAccount ac = new SavingsAccount(200.0, "Jones", 0.02);
        ac.deposit(400);
        System.out.println(ac.getBalance()); // 600
        ac.applyInterest();
        System.out.println(ac.getBalance()); // 630

        /*SavingsAccount otherAccount = new SavingsAccount(500.0, "Smith", 0.02);

        System.out.println(ac.compareTo(otherAccount));
        otherAccount.setBalance(1000);
        System.out.println(otherAccount.getBalance());*/

        /*try {
            ac.withdraw(10);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e);
        }
        ac.applyInterest();
        System.out.println(ac);
        */
    }
}
