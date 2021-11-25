package com.maksym.Models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

  private List<Account> accounts = new ArrayList<>();

  public void printAccounts() {
    if (accounts.isEmpty()) {
      System.out.println("Empty!");
    }
    for (Account account : accounts) {
      System.out.println("Account id: " + account.getId() + ", account name: " + account.getName() + ", account cash: " + account.getCash());
    }
  }

  public int addAccount(String name) {
    Account account = new Account(name);
    accounts.add(account);
    return account.getId();
  }

  public void sendMoney(int senderId, int recipientId, int cash) {
    Account sender = findAccountForId(senderId);
    Account recipient = findAccountForId(recipientId);

    if (sender != null && recipient != null && cash > 0) {
      sender.send(recipient, cash);
    }
  }

  public void depositeMoney(int id, int cash) {
    Account account = findAccountForId(id);

    if (account != null && cash > 0) {
      account.deposite(cash);
    }
  }

  private Account findAccountForId(int id) {
    for (Account account : accounts) {
      if (account.getId() == id) {
        return account;
      }
    }
    return null;
  }

  public void removeAccount(int id) {
    accounts.remove(findAccountForId(id));
  }

}
