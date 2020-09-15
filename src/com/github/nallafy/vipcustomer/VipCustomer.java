package com.github.nallafy.vipcustomer;

public class VipCustomer {
    private String name;
    private double credLimit;
    private String emailAd;

    public VipCustomer(){this("Default Name", 0.00, "someone@someone.com"); }

    public VipCustomer(String name, double credLimit){
      this(name, credLimit, "someone@someone.com");
    }

    public VipCustomer(String name, double credLimit, String emailAd){
        this.name = name;
        this.credLimit = credLimit;
        this.emailAd = emailAd;
    }

    //getters=============================================

    public String getEmailAd(){ return emailAd; }
    public String getName() { return name; }
    public double getCredLimit() { return credLimit; }
}
