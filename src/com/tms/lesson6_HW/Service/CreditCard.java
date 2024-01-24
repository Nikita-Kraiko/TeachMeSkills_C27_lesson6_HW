package com.tms.lesson6_HW.Service;

public class CreditCard {

    public String accountNumber;
    public double invoiceAmount;

    public CreditCard(String accountNumber, double invoiceAmount){
        this.accountNumber = accountNumber;
        this.invoiceAmount = invoiceAmount;
    }

    public void addMoney(double money){
        this.invoiceAmount += money;
    }

    public void withdrawMoney(double money){
        if (this.invoiceAmount < money){
            System.out.println("Error. insufficient funds");
        }else {
            this.invoiceAmount -= money;
        }
    }

    public void showInfo(){
        System.out.println("Account number: " + this.accountNumber + "\n" + "Invoice amount: " + this.invoiceAmount);
    }

}
