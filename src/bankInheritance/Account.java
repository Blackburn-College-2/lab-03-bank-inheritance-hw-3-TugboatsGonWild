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
    ArrayList<Money> history = new ArrayList<Money>();

    public Account(Money balance) {
        this.balance = balance;

    }

    public void withdraw(Money m) {
        this.balance.subtract(m);
    }

    public void deposit(Money m) {
        this.balance.add(m);
        history.add(m);
    }

    public Money getBalance() {
        System.out.println(balance);
        return balance;
    }

}
