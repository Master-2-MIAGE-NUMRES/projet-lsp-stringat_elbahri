public class Main {

    public static void main(String[] args) {
        BankAccount currentAccount = new CurrentAccount(1000);
        BankAccount savingsAccount = new SavingsAccount(1000);

        currentAccount.deposit(100);
        savingsAccount.deposit(100);

        ((CurrentAccount) currentAccount).withdraw(100);
        System.out.println(currentAccount.balance);

        ((SavingsAccount) savingsAccount).deposit(100);
        System.out.println(savingsAccount.balance);

        // on ne teste pas le retrait d'argent d'un compte d'épargne car on ne peut pas retirer de l'argent d'un compte d'épargne
    }

}
