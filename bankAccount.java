package com.bankServices;

import java.util.Scanner;

import com.bankServices.*;

public class bankAccount {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Holder name: ");
        String userName = scan.next();
        System.out.println("Enter Account Number: ");
        int accountNum = scan.nextInt();
        System.out.println("Enter Account Balance : ");
        int balance = scan.nextInt();
        int amount;
        System.out.println("Select an option: ");
        System.out.println("To Deposit Amount,Enter : add\nTo Withdraw Amount, Enter : get");
        String choice = scan.next();

        customer user = new customer();

        user.createAccount(userName, accountNum, balance);

        switch (choice) {
            case "add":
            case "Add":
            case "ADD":
                user.checkAmount();
                System.out.println("Enter Amount to Deposit");
                amount = scan.nextInt();
                user.depositAmount(amount);
                break;
            case "get":
            case "Get":
            case "GET":
                user.checkAmount();
                System.out.println("Enter Amount to withdraw :");
                amount = scan.nextInt();
                user.withdrawAmount(amount);
                break;
            default:
                System.out.println("Invalid Selection");
        }

        user.getDetail();
        scan.close();
    }
}
