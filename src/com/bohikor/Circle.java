package com.bohikor;

public class Circle {
    private  double pi = 3.14159;
    private int radius;
    private double area;
    private int diameter;
    private double circumference;



    public Circle( int rad){
        radius = rad;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculations(){
        diameter = radius*2;
        area = pi*radius*radius;
        circumference = 2*pi*radius;

        System.out.println("the diameter is"+ diameter);
        System.out.println("the Area is "+ area);
        System.out.println("the Circumference is "+ circumference);

    }


}
