package com.example.demostudygroup.model;

public class Customer {

    private String accountNumber;
    private String customerName;
    private long availableBalance;


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAvailableBalance(long availableBalance) {
        this.availableBalance = availableBalance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getAvailableBalance() {
        return availableBalance;
    }

}
