package com.example.bestgeometryappever;

public class TriangleArea {


    private double base;
    private double height;
    private double areaT;

    // Create a constructor for the Rectangle class
    public TriangleArea(double base, double height){
        this.base = base;
        this.height = height;
    } // end Rectangle() initializer

    public double getAreaT(){
        areaT = (0.5 * base) * height;
        return areaT;
    } // end calcAreaT()

} // end TriangleArea{}
