package gr.aueb.cf.ch12.bankapp.model;

/**
 * The overdraft account represents an account that you can make a withdraw
 * with no limits.
 */

public class OverdraftAccount {
    private String firstname;
    private String lastname;
    private String iban;
    private String ssn;
    private double balance;

    /**
     * Initialized a newly created account.
     */
    public OverdraftAccount() {
    }

    /**
     * Constructs a new account with specific :
     *
     * @param firstname     holders name
     * @param lastname      holders surname
     * @param iban          iban of account
     * @param ssn           account number
     * @param balance       the balance of account
     */
    public OverdraftAccount(String firstname, String lastname, String iban, String ssn, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.iban = iban;
        this.ssn = ssn;
        this.balance = balance;
    }

    /**
     * Get the firstname
     *
     * @return the name of owner
     */
    public String getFirstname() {return firstname;}


    /**
     * Gets the lastname
     * @return  the surname of owner
     */
    public String getLastname() {return lastname;}

    /**
     * Gets the iban
     * @return      the iban of account
     */
    public String getIban() {return iban;}

    /**
     * Gets the ssn
     * @return the number of account
     */
    public String getSsn() {return ssn;}

    /**
     * Gets the balance of account
     * @return  the balance.
     */
    public double getBalance() {return balance;}


    /**
     * Return the state of the account
     * @return
     */
    public String overdraftAccountToString() {
        return "OverdraftAccount{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", iban='" + iban + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
    }

    /**
     * Performs a withdrawal in specific account
     *
     * @param amount    the amount of money for withdrawal
     * @param ssn       the account number.
     */
    public void wihdraw(double amount, String ssn) {
        if (this.ssn == ssn) {
            balance -=amount;
        } else {
            System.out.println("Incorrect SSN");
        }
    }


}
