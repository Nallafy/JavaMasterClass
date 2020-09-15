package com.github.nallafy.BankAccountPractice;

public class account {
    private int customberAccId;
    private double customerBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNo;

    //setters
    public void setCustomerAccId(int x){
        this.customberAccId = x;

    }

    public void setCustomerBalance(double x){
        this.customerBalance = x;
    }

    public void setCustomerName(String x){
        this.customerName = x;
    }

    public void setCustomerEmail(String x){
        this.customerEmail = x;
    }

    public void setCustomerPhoneNo(int x){
        this.customerPhoneNo = x;
    }

//===============getters===========================

    public int getCustomerAccId(){
        return customberAccId;
    }

    public double getCustomerBalance(){
        return customerBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public int getCustomerPhoneNo(){
        return customerPhoneNo;
    }


}
