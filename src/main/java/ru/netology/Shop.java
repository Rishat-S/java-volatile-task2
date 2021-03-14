package ru.netology;

import java.util.Random;

public class Shop implements Runnable {
    AccountsDepartament accountsDepartament;
    int[] account;

    public Shop(AccountsDepartament accountsDepartament) {
        this.accountsDepartament = accountsDepartament;
        account = new Random()
                .ints(Main.MIN_VALUE, Main.MAX_VALUE)
                .limit(Main.MAX_SIZE)
                .toArray();
    }

    @Override
    public void run() {
        for (int value : account) {
            accountsDepartament.add(value);
        }
    }
}
