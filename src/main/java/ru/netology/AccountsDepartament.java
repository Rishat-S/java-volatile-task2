package ru.netology;

import java.util.concurrent.atomic.LongAdder;

public class AccountsDepartament {
    private final LongAdder account;

    public AccountsDepartament() {
        account = new LongAdder();
    }

    public void add(int value) {
        account.add(value);
    }

    public long getSum() {
        return account.sum();
    }
}
