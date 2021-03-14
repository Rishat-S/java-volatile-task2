package ru.netology;

import java.util.Random;

public class Shop implements Runnable {
    AccountsDepartament accountsDepartament;
    int[] cashDesks;

    public Shop(AccountsDepartament accountsDepartament) {
        this.accountsDepartament = accountsDepartament;
        cashDesks = new Random()
                .ints(Main.MIN_VALUE, Main.MAX_VALUE)
                .limit(Main.NUMBER_OF_CASH_DESKS)
                .toArray();
    }

    @Override
    public void run() {
        for (int value : cashDesks) {
            accountsDepartament.add(value);
        }
    }
}
