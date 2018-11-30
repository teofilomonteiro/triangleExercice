package com.teofilom.triangle;

import com.teofilom.triangle.models.Triangle;
import com.teofilom.triangle.models.TriangleBuilder;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        Double sideA, sideB, sideC;

        if (args.length > 0 && args.length < 4) {
            sideA = Double.valueOf(args[0]);
            sideB = Double.valueOf(args[1]);
            sideC = Double.valueOf(args[2]);
        } else {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the side A: ");
            sideA = scan.nextDouble();
            System.out.println("Enter the side B: ");
            sideB = scan.nextDouble();
            System.out.println("Enter the side C: ");
            sideC = scan.nextDouble();
        }

        Triangle triangle = new TriangleBuilder()
            .withSideA(sideA)
            .withSideB(sideB)
            .withSideC(sideC)
            .build();

        System.out.println(triangle.type());
    }
}
