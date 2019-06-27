package com.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shapes.Sphere;


public class SphereTest {
    @DisplayName("Test sphare volume is 523.6 when radius is 5")
    @Test    
    public void testSphare_5() {
        Sphere t = new Sphere();
        assertEquals(523.6, t.volume(5));
        
    }
    
    @DisplayName("Test sphare volume is 4.19 when radius is 1")
    @Test    
    public void testSphare_1() {
    	Sphere t = new Sphere();
        assertEquals(4.19, t.volume(1));
        
    }   
}