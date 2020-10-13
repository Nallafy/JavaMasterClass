package com.github.nallafy.shawngay;

public class typesofitems {
    String name;
    double price;

    //setters

    public void setField(String type){
        if(type == "flamethrower"){
            this.name = "Flamethrower";
            this.price = 2000.00;


        }else if(type == "tite"){
            this.name = "tite";
            this.price = 0.00;
        }else{

        }



    }

    public void displayFields(){
        System.out.println(this.name);
        System.out.println(this.price);
    }




}
