package ru.netology;

import java.util.Random;

public class Shop implements Runnable {
    AccountsDepartament accountsDepartament;
    int[] cashDesks;

    public Shop(AccountsDepartament accountsDepartament) {
        this.accountsDepartament = accountsDepartament;
        cashDesks = new Random()
                .ints(Main.MIN_CASH_DESK_REVENUE, Main.MAX_CASH_DESK_REVENUE)
                .limit(Main.NUMBER_OF_CASH_DESKS)
                .toArray();
    }

    @Override
    public void run() {
        for (int cashDeskRevenue : cashDesks) {
            accountsDepartament.add(cashDeskRevenue);
        }
    }
}
