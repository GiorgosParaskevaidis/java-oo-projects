package gr.aueb.cf.ch12.bankapp;

import gr.aueb.cf.ch12.bankapp.model.OverdraftAccount;
import gr.aueb.cf.ch12.bankapp.model.JointAccount;

public class Main {

    public static void main(String[] args) {
        JointAccount common = new JointAccount("alice", "bob", "123456789.0");
        OverdraftAccount account = new OverdraftAccount("Bob", "M.", "123456", "1234", 1000.0);

        System.out.println(common.toString());

        System.out.println(account.overdraftAccountToString());
        account.wihdraw(2000.0, "1234");
        System.out.println(account.getBalance());


    }
}
