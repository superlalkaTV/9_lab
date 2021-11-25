package com.maksym;

import com.maksym.Controllers.BankController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankController bankController = new BankController();
        bankController.menu(new Scanner(System.in));
    }
}
