package com.teofilom.triangle;

import com.teofilom.triangle.models.Triangle;
import com.teofilom.triangle.models.TriangleBuilder;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side A: ");
        Double sideA = scan.nextDouble();
        System.out.println("Enter the side B: ");
        Double sideB = scan.nextDouble();
        System.out.println("Enter the side C: ");
        Double sideC = scan.nextDouble();

        Triangle triangle = new TriangleBuilder()
            .withSideA(sideA)
            .withSideB(sideB)
            .withSideC(sideC)
            .build();

        System.out.println(triangle.type());
    }
}
