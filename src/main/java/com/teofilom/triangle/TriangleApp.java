package com.teofilom.triangle;

import com.teofilom.triangle.models.Triangle;
import com.teofilom.triangle.models.TriangleBuilder;

public class TriangleApp {
    public static void main(String[] args) {
        Double sideA, sideB, sideC;

        switch (args.length) {
            case 3:
                try {
                    sideA = Double.valueOf(args[0]);
                    sideB = Double.valueOf(args[1]);
                    sideC = Double.valueOf(args[2]);
                } catch (NumberFormatException e) {
                    printHelp();
                    return;
                }
                break;
            default:
                printHelp();
                return;
        }

        Triangle triangle = new TriangleBuilder()
            .withSideA(sideA)
            .withSideB(sideB)
            .withSideC(sideC)
            .build();

        System.out.println(triangle.type());
    }

    public static void printHelp() {
        System.out.println("Usage:");
        System.out.println("\n\tjava -jar triangle [-h]");
        System.out.println("\nor");
        System.out.println("\n\tjava -jar triangle [sideA] [sideB] [sideC]");
        System.out.println("\nArguments:");
        System.out.println("\t-h, --help\t\t\tShow this help message and exit.");
        System.out.println("\tsideA\t\t\t\ttriangle side A length(float number)");
        System.out.println("\tsideB\t\t\t\ttriangle side B length(float number)");
        System.out.println("\tsideC\t\t\t\ttriangle side C length(float number)");
    }
}
