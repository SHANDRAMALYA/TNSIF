public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with only account number
    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Constructor with account number and holder name
    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    // Full initialization constructor
    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
