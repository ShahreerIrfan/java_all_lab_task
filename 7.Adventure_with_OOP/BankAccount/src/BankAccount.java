class BankAccount {
    public String accountNumber;
    public double balance;
    public double interestRate;

    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ৳" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ৳" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: ৳" + balance);
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}
<<<<<<< HEAD
=======
//.........
>>>>>>> 0fce85bbd96db3ce4b02f4154155b26cbc71a8b1
