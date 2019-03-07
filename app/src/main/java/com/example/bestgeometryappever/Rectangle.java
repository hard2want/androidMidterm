package com.example.bestgeometryappever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Rectangle extends AppCompatActivity {

    private double length;
    private double width;
    private double areaR;

    // Create a constructor for the Rectangle class
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    } // end Rectangle() initializer

    public double getAreaR(){
        areaR = length * width;
        return areaR;
    } // end calcAreaR()


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
    } // end onCreate()
} // end Rectangle
