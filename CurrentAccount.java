public class CurrentAccount extends BankAccount implements Withdrawable {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
