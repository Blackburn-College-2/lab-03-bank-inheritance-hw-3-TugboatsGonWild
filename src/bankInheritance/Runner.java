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
        double money = input.nextDouble();
        Money money1 = new Money(currency1, money);
        Account account1 = new Account(money1);
        System.out.println("Withdrawal time");
        System.out.println("How much?");
        money = input.nextDouble();
        Money money2 = new Money(currency1, money);
        account1.withdraw(money2);
        account1.getBalance();
        System.out.println("Time to pay yourself");
        System.out.println("How much?");
        money = input.nextDouble();
        money2 = new Money(currency1, money);
        account1.deposit(money2);
        account1.getBalance();
    }

}
