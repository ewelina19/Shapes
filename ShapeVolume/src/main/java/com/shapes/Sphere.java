package com.shapes;

public class Sphere  extends Shape{
    @Override
    public double volume(double size)
    {
        double vol = ( 4 * Math.PI *  Math.pow(size, 3) ) / 3;
        return round(vol);
    }
}
