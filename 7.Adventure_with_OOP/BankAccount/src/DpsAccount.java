class DpsAccount extends BankAccount {
    public DpsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, 0.05); // 5% interest rate for DPS account
    }
}
