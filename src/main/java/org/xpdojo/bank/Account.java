package org.xpdojo.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    public int balance;
    private List<HistoryEntity> history = new ArrayList<>();

    public void deposit(int i) {
        balance += i;
        history.add(new HistoryEntity(balance));
    }

    public void withdraw(int i) {
        balance -= i;
        history.add(new HistoryEntity(balance));
    }


    public void transfer(Account accountB, int i) {
        accountB.deposit(i);
        this.withdraw(i);
    }

    public void displayBalanceSlip() {
        System.out.println(history.toString());
    }
}
