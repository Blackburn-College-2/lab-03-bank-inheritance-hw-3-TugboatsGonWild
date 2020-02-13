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
/**
 * gives amount value back to money
 */
    public long getAmount() {
        return amount;
    }

    public Money(Currency currency, double balance) {
        amount = (long) balance;
    }
/**
 * 
 * @return returns nothing and isn't used
 */
    public String getAmountString() {
        String string = "";
        return string;
    }
/**
 * 
 * @returns amount of money after deposit
 */
    public Money add(Money money) {
        this.amount += money.getAmount();
        System.out.println("Account: " + amount);
        return this;
    }
/**
 * 
 * @returns amount of money after withdrawal 
 */
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
        String string = "" + amount;
        return string;
    }
/**
 * 
 * @return not used
 */
    public Money Multiply() {
        return this;
    }
}
