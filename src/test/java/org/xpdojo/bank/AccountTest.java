package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initialAmountIsZero() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance).isEqualTo(30);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(10);
        assertThat(account.balance).isEqualTo(10);
    }
}
