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
abstract class Account {

    private Money balance;
    private ArrayList<Money> history = new ArrayList<Money>();

    public Account(Money balance) {
        this.balance = balance;
    }
/**withdraw and deposit into account 
 */
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
/**gets the balance of account 
 */
    public Money getBalance() {
        System.out.println(balance);
        return balance;
    }
/** makes a string 
 */
    @Override
    public String toString() {
        String string = "Account holds " + this.balance.getAmount();
        return string;

    }
/**prints arraylist history of savings account transactions  
 */
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
/**wasn't sure how to do the transaction stuff or where the transactions were 
 * coming from or any of that jazz. 
 */
    public void getHistory(Transaction tran) {

        System.out.println("Old Balance     Change      New Balance     Date");
        for (int i = 0; i < 10; i++) {

        }
    }

}
