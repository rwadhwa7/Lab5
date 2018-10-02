/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,

        /**
         *
         */
        SAVINGS,

        /**
         *
         */
        STUDENT,

        /**
         *
         */
        WORKPLACE
    }

    /**
     * The total number of accounts.
     */
    private static int totalAccounts = 0;

    /**
     *
     */
    private int accountNumber;

    /**
     *
     */
    private BankAccountType accountType;

    /**
     *
     */
    private double accountBalance;

    /**
     *
     */
    private String ownerName;

    /**
     *
     */
    private double interestRate;

    /**
     *
     */
    private double interestEarned;

    /**
     * This is the constructor for this class
     * @param name the name of the bank account holder
     * @param accountCategory the type of bank account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        totalAccounts++;
        Bank.getNumberOfAccount();
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Getter for the accountNumber
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter for accountType
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Getter for accountBalance
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Getter for ownerName
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Getter for interestName
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Getter for interestEarned
     * @return interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Sets the new accountBalance.
     * @param newAccountBalance the newAccountBalance
     */
    public void setAccountBalance(final double newAccountBalance) {
        accountBalance = newAccountBalance;
    }

    /**
     * Sets the new ownerName.
     * @param newOwnerName the new OwnerName
     */
    public void setOwnerName(final String newOwnerName) {
        ownerName = newOwnerName;
    }

    /**
     * Getter for totalAccounts.
     * @return totalAccounts
     */
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
