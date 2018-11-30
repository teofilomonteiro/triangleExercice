package com.teofilom.triangle.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    private Triangle victim;

    @Test
    void scaleneTriangleTest() {
        victim = new TriangleBuilder()
            .withSideA(10.0)
            .withSideB(20.5)
            .withSideC(30.9)
            .build();

        assertEquals(victim.getClass(), ScaleneTriangle.class);
    }

    @Test
    void equilateralTriangleTest() {
        victim = new TriangleBuilder()
            .withSideA(10.0)
            .withSideB(10.0)
            .withSideC(30.9)
            .build();

        assertEquals(victim.getClass(), IsoscelesTriangle.class);
    }


    @Test
    void isoscelesTriangleTest() {
        victim = new TriangleBuilder()
            .withSideA(10.0)
            .withSideB(10.0)
            .withSideC(10.0)
            .build();

        assertEquals(victim.getClass(), EquilateralTriangle.class);
    }
}