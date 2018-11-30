package com.teofilom.triangle.models;

public class ScaleneTriangle extends Triangle {

    public ScaleneTriangle(Double sideA, Double sideB, Double sideC) {
        super(sideA, sideB, sideC);
    }

    public String type() {
        return "Scalene Triangle";
    }

}
