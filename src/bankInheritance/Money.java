/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankInheritance;

import java.util.Scanner;

/**
 *
 * @author wesley.mcmillen
 */
public class Money {

    Scanner input = new Scanner(System.in);
    private Currency currency;
    private long amount;

    public long getAmount() {
        return amount;
    }

    public Money(Currency currency, double balance) {
        amount = (long) balance;
    }

    public String getAmountString() {
        String string = "";
        return string;
    }

    public Money add(Money money) {
        this.amount += money.getAmount();
        System.out.println("Account: " + amount);
        return this;
    }

    public Money subtract(Money money) {
        this.amount += (-money.getAmount());
        System.out.println("Account: " + amount);
        return this;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    @Override
    public String toString() {
        String string = "";
        return string;
    }
}
