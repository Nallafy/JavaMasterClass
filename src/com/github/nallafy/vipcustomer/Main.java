package com.github.nallafy.vipcustomer;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args){
        VipCustomer a;
        VipCustomer b;
        VipCustomer c;

        a = new VipCustomer();

        System.out.println("Name: " + a.getName());
        System.out.println("Credit Limit: " + a.getCredLimit());
        System.out.println("Email: " + a.getEmailAd());

        System.out.println("");

        b = new VipCustomer("Carl Mercado", 100000.00);

        System.out.println("Name: " + b.getName());
        System.out.println("Credit Limit: " + b.getCredLimit());
        System.out.println("Email: " + b.getEmailAd());

        System.out.println("");

        c = new VipCustomer("Carl Mercado", 100000.00, "carlmercadoaz@gmail.com");

        System.out.println("Name: " + c.getName());
        System.out.println("Credit Limit: " + c.getCredLimit());
        System.out.println("Email: " + c.getEmailAd());

    }
}
