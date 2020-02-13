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
public class SavingsAccount extends Account {

    private Money balance;
    private ArrayList<Money> history = new ArrayList<Money>();
    private double intrRate = 1.03;

    public SavingsAccount(Money balance) {
        super(balance);
        this.balance = balance;
    }

    /**
     * accrues interest and adds it
     */
    public double Accrue(Money m) {
        double accrue = m.getAmount() * intrRate;
        return accrue;
    }

    /**
     * override of withdraw and deposit methods so i can use Accrue in withdraw
     * @param m
     */
    @Override
    public void withdraw(Money m) {
        this.balance.subtract(m);
        history.add(new Money(m.getCurrency(), -m.getAmount()));
        this.toString();
        this.Accrue(balance);
    }

    @Override
    public void deposit(Money m) {
        this.balance.add(m);
        history.add(new Money(m.getCurrency(), m.getAmount()));
        this.toString();
    }

    /**
     *
     * gives the transaction history of the savings account
     */
    @Override
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
