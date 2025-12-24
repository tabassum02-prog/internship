public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showAccountDetails() {
        System.out.println(this.toString());
    }

    // Getters & Setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    @Override
    public String toString() {
        return "BankAccount[accountNumber=" + accountNumber + ", holderName=" + holderName +
                ", balance=" + balance + ", accountType=" + accountType + "]";
    }

    public static void main(String[] args) {


        BankAccount account = new BankAccount(
                "ACC12***",
                "Ayesha Shaikh",
                5000.0,
                "Savings"
        );

        account.showAccountDetails();

        account.deposit(2000);

        account.withdraw(1500);

        account.withdraw(10000);

        account.showAccountDetails();
    }
}