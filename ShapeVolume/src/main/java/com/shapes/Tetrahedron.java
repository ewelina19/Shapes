package com.shapes;

public class Tetrahedron  extends Shape {
    @Override
    public double volume(double size)
    {
        double vol = Math.sqrt(2) / 12 *  Math.pow(size, 3);
        return round(vol);
    }
}
