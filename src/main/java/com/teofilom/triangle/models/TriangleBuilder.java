package com.teofilom.triangle.models;

import java.util.Objects;

public final class TriangleBuilder {
    private Double sideA;
    private Double sideB;
    private Double sideC;

    public TriangleBuilder withSideA(Double sideA) {
        this.sideA = sideA;
        return this;
    }

    public TriangleBuilder withSideB(Double sideB) {
        this.sideB = sideB;
        return this;
    }

    public TriangleBuilder withSideC(Double sideC) {
        this.sideC = sideC;
        return this;
    }

    public Triangle build() {
        if (allSidesEqual()) {
            return new EquilateralTriangle(this.sideA, this.sideB, this.sideC);
        } else if (twoSidesEqual()) {
            return new IsoscelesTriangle(this.sideA, this.sideB, this.sideC);
        }

        return new ScaleneTriangle(this.sideA, this.sideB, this.sideC);
    }

    private boolean twoSidesEqual() {
        return Objects.equals(this.sideA, this.sideB) ||
        Objects.equals(this.sideA, this.sideC) ||
        Objects.equals(this.sideB, this.sideC);
    }

    private boolean allSidesEqual() {
        return Objects.equals(this.sideA, this.sideB) && Objects.equals(this.sideB, this.sideC);
    }
}
