public class Main {

    public static void main(String[] args) {

        // Create a BankAccount with initial balance
        BankAccount account = new BankAccount(1000);

        try {
            // First withdrawal - should succeed
            account.withdraw(500);

            // Second withdrawal - should fail and throw exception
            account.withdraw(700);

        } catch (InsufficientBalanceException e) {
            // Handle custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}