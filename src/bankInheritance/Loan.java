/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankInheritance;

/**
 *
 * @author wesley.mcmillen
 */
public class Loan extends Account {

    private long loanBalance;
    private long intrRate = 10;

    public Loan(Money balance) {
        super(balance);
        this.loanBalance = balance.getAmount();
    }
/**
 * 
 * @returns the amount left on the loan 
 */
    public long loanPay(Money m) {
        System.out.println("Loan amount: " + loanBalance);
        System.out.println("Payment of " + m.getAmount());
        loanBalance = loanBalance - m.getAmount();
        if (loanBalance > 0) {
            loanBalance = loanBalance + intrRate;
        }

        System.out.println(loanBalance + " is left on your loan");
        return loanBalance;
    }

}
