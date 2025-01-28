public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    // on implemente pas l'interface Withdrawable car on ne peut pas retirer de l'argent d'un compte d'épargne
}
