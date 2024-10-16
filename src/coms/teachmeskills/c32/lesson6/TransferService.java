package coms.teachmeskills.c32.lesson6;

public class TransferService {

    public static void addMoney(CreditCard card, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            card.setBalance(card.getBalance() + amount);
        }
    }

    public static void minusMoney(CreditCard card, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            if (card.getBalance() > amount) {
                card.setBalance(card.getBalance() - amount);
            } else {
                System.out.println("Not enough money");
            }
        }
    }
}
