/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankInheritance;

import java.util.Scanner;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To create and account, enter 1");
        int ans = input.nextInt();
        if (ans != 1) {
            return;
        }
        System.out.println("Enter currency type");
        String type = input.nextLine();
        type = input.nextLine();
        System.out.println("Now that currencies symbol");
        String symbol = input.nextLine();
        Currency currency1 = new Currency(type, symbol);
        System.out.println("Please enter amount of currency to add to new account");
        double money = 1000;
        Money money1 = new Money(currency1, money);
        Account account1 = new Account(money1);
        System.out.println("Withdrawal time");
        money = 400;
        Money money2 = new Money(currency1, (money));
        account1.withdraw(money2);
        account1.getBalance();
        System.out.println("Time to get paid");
        money = 500;
        money2 = new Money(currency1, money);
        account1.deposit(money2);
        account1.getBalance();
        System.out.println("Time to get paid");
        money = 250;
        money2 = new Money(currency1, money);
        account1.deposit(money2);
        account1.getBalance();
        System.out.println("Time to get paid");
        money = 5000;
        money2 = new Money(currency1, money);
        account1.deposit(money2);
        account1.getBalance();
        System.out.println("Withdrawal time");
        money = 3500;
        money2 = new Money(currency1, money);
        account1.withdraw(money2);
        account1.getBalance();
        System.out.println("Time to get paid");
        money = 2050;
        money2 = new Money(currency1, money);
        account1.deposit(money2);
        account1.getBalance();
        System.out.println("Withdrawal time");
        money = 570;
        money2 = new Money(currency1, money);
        account1.withdraw(money2);
        account1.getBalance();
        System.out.println("Withdrawal time");
        money = 500;
        money2 = new Money(currency1, money);
        account1.withdraw(money2);
        account1.getBalance();
        System.out.println("Time to get paid");
        money = 1000;
        money2 = new Money(currency1, money);
        account1.deposit(money2);
        account1.getBalance();
        System.out.println("Withdrawal time");
        money = 1500;
        money2 = new Money(currency1, money);
        account1.withdraw(money2);
        account1.getBalance();

        account1.printHistory(account1);
    }

}
