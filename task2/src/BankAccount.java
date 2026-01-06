public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {

        if (balance < amount) {
            throw new InsufficientBalanceException("Not enough balance to withdraw!");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw Successful! Remaining balance: " + balance);
        }
    }
}