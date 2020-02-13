/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankInheritance;

import java.util.Scanner;

/**
 * PREDICTION 6 HOURS
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
        double money = 1000;
        Money money1 = new Money(currency1, money);
        SavingsAccount account1 = new SavingsAccount(money1);
        for (int i = 0; i < 3; i++) {
            money = 500 * Math.random() + 1;
            Money money2 = new Money(currency1, (money));
            account1.deposit(money2);
            account1.getBalance();
            for (int j = 0; j < 1; j++) {
                money = 250 * Math.random() + 1;
                money2 = new Money(currency1, (money));
                account1.withdraw(money2);
                account1.getBalance();
            }
        }
        account1.printHistory(account1);
        money = 1000;
        Money money3 = new Money(currency1, money);
        Loan moneyLoan = new Loan(money3);
        money = 500;
        money3 = new Money(currency1, money);
        moneyLoan.loanPay(money3);
        money = 450;
        money3 = new Money(currency1, money);
        moneyLoan.loanPay(money3);
        money = 70;
        money3 = new Money(currency1, money);
        moneyLoan.loanPay(money3);

    }

}
