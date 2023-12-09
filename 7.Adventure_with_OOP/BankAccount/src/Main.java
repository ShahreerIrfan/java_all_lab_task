public class Main {
    public static void main(String[] args) {
        // Create objects using the classes
        SavingsAccount savingsAccount = new SavingsAccount("Irfan", 1000);
        DpsAccount dpsAccount = new DpsAccount("Sabbir", 2000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("Joy", 3000, 12);

        System.out.println("Savings Account Information...");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Interest: $" + savingsAccount.calculateInterest());

        System.out.println("DPS Account Information....");
        dpsAccount.deposit(1000);
        dpsAccount.withdraw(500);
        System.out.println("DPS Account Interest: $" + dpsAccount.calculateInterest());

        System.out.println("fixedDeposit  Account Information....");
        fixedDepositAccount.deposit(2000);
        fixedDepositAccount.withdraw(1000);
        System.out.println("Fixed Deposit Account Interest: $" + fixedDepositAccount.calculateInterest());
    }
}