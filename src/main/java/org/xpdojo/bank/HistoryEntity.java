package org.xpdojo.bank;

import java.time.Instant;

public class HistoryEntity {

    private Instant date;

    private int balance;

    public HistoryEntity(int balance) {
        this.date = Instant.now();
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "HistoryEntity{" +
                "date=" + date +
                ", balance=" + balance +
                '}';
    }
}
