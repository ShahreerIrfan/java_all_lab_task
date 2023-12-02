class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, 0.02); // 2% interest rate for savings account
    }
}

