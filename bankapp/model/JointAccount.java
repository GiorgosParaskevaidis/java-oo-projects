package gr.aueb.cf.ch12.bankapp.model;

/**
 * The JointAccount represents an account with two holders
 * holder1 and holder2 is the two owners and ssn is the account number.
 */
public class JointAccount {
    private final String holder1;
    private final String holder2;
    private final String ssn;

    /**
     * Initialized a newly created account.
     */
    public JointAccount() {
        holder1 = "";
        holder2 = "";
        ssn = "";
    }

    /**
     * Constructs a new account with specific :
     *
     * @param holder1   the 1st owner
     * @param holder2   the 2nd owner
     * @param ssn       the acc number
     */
    public JointAccount(String holder1, String holder2, String ssn) {
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.ssn = ssn;
    }

    /**
     * Gets the 1st owner
     *
     * @return  the name of 1st owner.
     */
    public String getHolder1() {
        return holder1;
    }

    /**
     * Gets the 2nd owner
     *
     * @return  the name of 2nd owner.
     */
    public String getHolder2() {
        return holder2;
    }

    /**
     * Gets the ssn
     *
     * @return  account number.
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Return the state of the account
     *
     * @return  the holder1 & holder2 and ssn.
     */
    public String toString() {
        return "JointAccount{" +
                "holder1='" + holder1 + '\'' +
                ", holder2='" + holder2 + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
