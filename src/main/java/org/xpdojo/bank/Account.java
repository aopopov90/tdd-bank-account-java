package org.xpdojo.bank;

public class Account {
    public int balance;
    public void deposit(int i) {
        balance += i;
    }

    public void withdraw(int i) {
        balance -= i;
    }


    public void transfer(Account accountB, int i) {
        accountB.deposit(i);
        this.withdraw(i);
    }
}
