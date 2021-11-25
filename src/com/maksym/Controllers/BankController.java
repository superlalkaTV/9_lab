package com.maksym.Controllers;

import com.maksym.Models.Bank;
import com.maksym.Views.BankView;
import java.util.Scanner;

public class BankController {

  private Bank bank = new Bank();

  public void menu(Scanner sc) {
    int input;
    while (true) {
      System.out.println(BankView.MENU);
      System.out.println(BankView.MENU_INPUT);
      switch (input = sc.nextInt()) {
        case 1: //Accounts
          bank.printAccounts();
          break;
        case 2: //Add account
          System.out.println(BankView.ENTER_ACCOUNT_NAME);
          bank.addAccount(sc.next());
          break;
        case 3: //Remove account
          System.out.println(BankView.ENTER_ID);
          bank.removeAccount(sc.nextInt());
          break;
        case 4: //Send money
          System.out.println(BankView.ENTER_SENDER_ID);
          int sender = sc.nextInt();
          System.out.println(BankView.ENTER_RECIPIENT_ID);
          int recipient = sc.nextInt();
          System.out.println(BankView.ENTER_MONEY_TO_SEND);
          int cash = sc.nextInt();
          bank.sendMoney(sender,recipient,cash);
          break;
        case 5: //Deposite money
          System.out.println(BankView.ENTER_ID);
          int id = sc.nextInt();
          System.out.println(BankView.ENTER_MONEY_TO_SEND);
          int deposite = sc.nextInt();
          bank.depositeMoney(id,deposite);
          break;
        case 0: //Exit
          return;
      }
    }

  }


}
