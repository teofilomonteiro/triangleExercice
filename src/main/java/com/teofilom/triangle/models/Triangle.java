package com.teofilom.triangle.models;

public abstract class Triangle {

    public abstract String type();

    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
