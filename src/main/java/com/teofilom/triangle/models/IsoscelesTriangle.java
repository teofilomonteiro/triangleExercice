package com.teofilom.triangle.models;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(Double sideA, Double sideB, Double sideC) {
        super(sideA, sideB, sideC);
    }

    public String type() {
        return "Isosceles Triangle";
    }

}
