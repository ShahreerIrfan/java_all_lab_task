class FixedDepositAccount extends BankAccount {
    private final int term;

    public FixedDepositAccount(String accountNumber, double balance, int term) {
        super(accountNumber, balance, 0.08);
        this.term = term;
    }

    @Override
    public double calculateInterest() {

        return balance * interestRate * term / 12;
    }
}