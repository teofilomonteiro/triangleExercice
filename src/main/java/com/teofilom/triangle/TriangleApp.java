package com.teofilom.triangle;

    import com.teofilom.triangle.models.Triangle;
    import com.teofilom.triangle.models.TriangleBuilder;

public class TriangleApp {
    public static void main(String[] args) {

        double side1, side2, side3;
        side1 = 10.3;
        side2 = 10.4;
        side3 = 10.5;

        Triangle triangle = new TriangleBuilder()
            .withSideA(side1)
            .withSideB(side2)
            .withSideC(side3)
            .build();

        System.out.println(triangle.type());
    }
}
