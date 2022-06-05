package com.company;

public class NationalBankAccount extends Database implements BankAccount{
    String fullname;
    int balance;
    String accountNumber;
    String pinCode;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public NationalBankAccount(String fullname, int balance, String accountNumber, String pinCode) {
        this.fullname = fullname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
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

    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        this.balance -= (credit + 200);
    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return fullname;
    }
}
