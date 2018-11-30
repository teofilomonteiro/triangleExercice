package com.teofilom.triangle.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquilateralTriangleTest {
    private EquilateralTriangle victim;

    @Test
    void typeTest() {
        victim = new EquilateralTriangle(20.5,20.5, 20.5);

        assertEquals(victim.type(), "Equilateral Triangle");
    }
}