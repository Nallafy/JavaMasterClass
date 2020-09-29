package com.github.nallafy.poolareapractice;

public class Rectangle {
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        this.width = (width <0.0) ? (this.width = 0) : (this.width = width);
        this.length = (length <0.0) ? (this.length = 0) : (this.length = length);

    }
        //methods

        public double getWidth(){
            return width;
        }

        public double getLength(){
            return length;
        }

        public double getArea(){
         return (getWidth() * getLength());
        }

    }

