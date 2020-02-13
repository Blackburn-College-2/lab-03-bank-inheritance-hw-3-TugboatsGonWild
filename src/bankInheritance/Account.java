/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankInheritance;

import java.util.ArrayList;

/**
 *
 * @author wesley.mcmillen
 */
public class Account {

    private Money balance;
    private ArrayList<Money> history = new ArrayList<Money>();

    public Account(Money balance) {
        this.balance = balance;

    }

    public void withdraw(Money m) {
        this.balance.subtract(m);
        history.add(new Money(m.getCurrency(), -m.getAmount()));
        this.toString();
    }

    public void deposit(Money m) {
        this.balance.add(m);
        history.add(new Money(m.getCurrency(), m.getAmount()));
        this.toString();
    }

    public Money getBalance() {
        System.out.println(balance);
        return balance;
    }

    @Override
    public String toString() {
        String string = "Account holds " + this.balance.getAmount();
        return string;

    }

    public void printHistory(Account account) {
        System.out.println("History:");
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i).getAmount() >= 0) {
                System.out.println("Deposit of " + history.get(i).getAmount());
            } else {
                System.out.println("Withdrawal of " + history.get(i).getAmount());
            }
        }

    }

}
