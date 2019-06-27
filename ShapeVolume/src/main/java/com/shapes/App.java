package com.shapes;

public class App {
    
    public static void main( String[] args ) 
    {
        double th = new Tetrahedron().volume(2);
        double cb = new Cube().volume(2);
        double sp = new Sphere().volume(2);

        System.out.println(" Tetrahedron: " + th);
        System.out.println(" Cube: " +cb);
        System.out.println(" Sphare: " +sp);
        
    }
}
