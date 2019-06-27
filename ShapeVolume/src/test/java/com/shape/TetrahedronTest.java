package com.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.shapes.Tetrahedron;


public class TetrahedronTest {
    @DisplayName("Test tetrahedron volume is 14.73 when edge is 5")
    @Test    
    public void testTetrahedron_5() {
        Tetrahedron t = new Tetrahedron();
        assertEquals(14.73, t.volume(5));
        
    }
    
    @DisplayName("Test tetrahedron volume is 0.12 when edge is 1")
    @Test    
    public void testTetrahedron_1() {
        Tetrahedron t = new Tetrahedron();
        assertEquals(0.12, t.volume(1));
        
    }   
}