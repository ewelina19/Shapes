package com.shapes;

public class Cube extends Shape{
    @Override
    public double volume(double size)
    {
        double vol = Math.pow(size, 3);
        return round(vol);
    }
}
