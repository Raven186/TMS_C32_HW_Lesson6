package coms.teachmeskills.c32.lesson6;

public class Task_2 {
    public static void task_2() {
        CreditCard card = new CreditCard("2200 5553 8493 2231", 5.20);

        TransferService.addMoney(card, 4.20);

        System.out.println(card.getBalance());

        TransferService.minusMoney(card, 4.20);

        System.out.println(card.getBalance());
    }
}
