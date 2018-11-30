package com.teofilom.triangle.models;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(Double sideA, Double sideB, Double sideC) {
        super(sideA, sideB, sideC);
    }

    public String type() {
        return "Equilateral Triangle";
    }

}
