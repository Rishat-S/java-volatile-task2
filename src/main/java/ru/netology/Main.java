package ru.netology;

public class Main {
    public static final int NUMBER_OF_CASH_DESKS = 5;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 3_500;

    public static void main(String[] args) throws InterruptedException {
        AccountsDepartament accountsDepartament = new AccountsDepartament();

        Thread shop1 = new Thread(new Shop(accountsDepartament), "Shop1");
        Thread shop2 = new Thread(new Shop(accountsDepartament), "Shop2");
        Thread shop3 = new Thread(new Shop(accountsDepartament), "Shop3");

        shop1.start();
        shop2.start();
        shop3.start();

        shop1.join();
        shop2.join();
        shop3.join();

        System.out.println("Result: " + accountsDepartament.getSum());
    }
}

