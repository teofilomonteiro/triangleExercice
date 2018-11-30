package com.teofilom.triangle.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsoscelesTriangleTest {
    private IsoscelesTriangle victim;

    @Test
    void typeTest() {
        victim = new IsoscelesTriangle(20.5,20.5, 30.9);

        assertEquals(victim.type(), "Isosceles Triangle");
    }
}