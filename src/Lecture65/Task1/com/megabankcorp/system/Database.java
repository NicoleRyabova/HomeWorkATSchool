package Lecture65.Task1.com.megabankcorp.system;

import Lecture65.Task1.com.megabankcorp.records.Account;

import java.math.BigDecimal;

public abstract class Database {
    public abstract void deposit(BigDecimal sum, Account account);

    public abstract void withdraw(BigDecimal sum, Account account);

    abstract BigDecimal getAmount(BigDecimal sum, Account account);

    void transfer(BigDecimal sum, Account firstAccount, Account secondAccount ) {
        deposit(sum, firstAccount);
        withdraw(sum,secondAccount);
    }
}
