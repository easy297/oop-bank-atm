package com.company;

public class CityBankAccount extends Database implements BankAccount {
    String name;
    String surname;
    int balance;
    String accountNumber;
    String pinCode;

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public CityBankAccount() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return this.balance;
    }

    @Override
    public void creditBalance(int credit) {
        this.balance -= credit;
    }

    @Override
    public void debetBalance(int debet) {
        this.balance += debet;
    }

    @Override
    public String accountData() {
        String r = name + " " + surname;
        return r;
    }


}
