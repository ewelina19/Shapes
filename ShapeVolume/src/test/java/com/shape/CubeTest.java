package com.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shapes.Cube;


public class CubeTest {
    @DisplayName("Test cube volume is 125 when width is 5")
    @Test    
    public void testCube_5() {
        Cube t = new Cube();
        assertEquals(125, t.volume(5));
        
    }
    
    @DisplayName("Test cube volume is 1 when width is 1")
    @Test    
    public void testCube_1() {
        Cube t = new Cube();
        assertEquals(1, t.volume(1));
        
    }   
}