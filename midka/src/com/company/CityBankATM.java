package com.company;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Account Number: ");
        String AcountNum = in.next();
        for (int i = 0; i < Database.allAccounts.length; i++) {
            if (AcountNum.equals(Database.allAccounts[i].getAccountNumber())) {
                System.out.print("Enter the Pin Code: ");
                String PinCode = in.next();
                if (PinCode.equals(Database.allAccounts[i].getPinCode())) {
                    if (Database.allAccounts[i] instanceof CityBankAccount) {
                        while (true) {
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL"); // снять деньги
                            System.out.println("PRESS [2] TO VIEW BALANCE"); // просмотр баланса
                            System.out.println("PRESS [3] TO CHANGE PIN CODE"); // изменить пин код
                            System.out.println("PRESS [4] TO CASH IN ACCOUNT"); // добавить деньги в счет
                            System.out.println("PRESS [5] TO VIEW ACCOUNT DATA"); // просмотр данные счета
                            System.out.println("PRESS [6] TO EXIT"); // выход
                            int n = in.nextInt();
                            if (n == 1) {
                                System.out.print("Enter the cash amount: ");
                                int credit = in.nextInt();
                                Database.allAccounts[i].creditBalance(credit);
                                System.out.println("Cash in amount of " + credit + " was withdrawal");
                                System.out.println("You have " + Database.allAccounts[i].totalBalance() + " balance on your card");
                            }
                            if (n == 2) {
                                System.out.println("You have " + Database.allAccounts[i].totalBalance() + " balance on your card");
                            }
                            if (n == 3) {
                                System.out.print("Enter the new PinCode: ");
                                String newPin = in.next();
                                Database.allAccounts[i].setPinCode(newPin);
                                System.out.println("Pin Code was Updated");
                            }
                            if (n == 4) {
                                System.out.print("Enter the cash amount(in account): ");
                                int debet = in.nextInt();
                                Database.allAccounts[i].debetBalance(debet);
                                System.out.println("You have " + Database.allAccounts[i].totalBalance() + " balance on your card now");
                            }
                            if (n == 5) {
                                System.out.println("Your Account Info: ");
                                System.out.println(Database.allAccounts[i].accountData());
                            }
                            if (n == 6) {
                                break;
                            }
                        }
                    } else if (Database.allAccounts[i] instanceof NationalBankAccount) {
                        while (true) {
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL"); // снять деньги - 200
                            System.out.println("PRESS [2] TO VIEW BALANCE"); // просмотр баланса
                            System.out.println("PRESS [3] TO EXIT"); // изменить пин код
                            int n = in.nextInt();
                            if (n == 1) {
                                System.out.print("Enter the cash amount: ");
                                int credit = in.nextInt();
                                Database.allAccounts[i].creditBalance(credit);
                                System.out.println("Cash in amount of " + credit + " was withdrawal(-200 for commission)");
                                System.out.println("You have " + Database.allAccounts[i].totalBalance() + " balance on your card");
                            }
                            if (n == 2) {
                                System.out.println("You have " + Database.allAccounts[i].totalBalance() + " balance on your card");
                            }
                            if (n == 3) {
                                break;
                            }
                        }
                    }
                }
            }

        }
    }
}

