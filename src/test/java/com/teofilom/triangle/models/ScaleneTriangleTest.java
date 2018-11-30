package com.teofilom.triangle.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaleneTriangleTest {
    private ScaleneTriangle victim;

    @Test
    void typeTest() {
        victim = new ScaleneTriangle(10.0,20.5, 30.9);

        assertEquals(victim.type(), "Scalene Triangle");
    }
}