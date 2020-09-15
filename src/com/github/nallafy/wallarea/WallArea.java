package com.github.nallafy.wallarea;

public class WallArea {
    private double width;
    private double height;

    public WallArea() {
        System.out.println("No args constructor");
    }

    public WallArea(double width, double height) {
        if (width <= 0) { this.width = 0;width = 0; } else{setWidth(width);}
        if (height <= 0) {this.height = 0; height = 0;} else{setHeight(height);}
    }

    //==========================getters==============================

    public double getWidth(){return width;}
    public double getHeight(){return height;}
    public double getArea(){return (getHeight() * getWidth()) ;}

    //==========================setters==============================

    public void setWidth(double width){if(width > 0){this.width = width;}else{this.width = 0; height = width;}}
    public void setHeight(double height){if(height > 0){this.height = height;}else{this.height = 0; height = 0;}}
}
