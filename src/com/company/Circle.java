package com.company;

public class Circle {
    double diameter;
    double radius;


    static void SquareCircle(double diameter, double radius) {
        double sqere;
        double length;
        sqere = 3.14 * (radius * radius);
        length = 3.14 * diameter;
        System.out.println(" ");
        System.out.println("Площа круга: " + sqere);
        System.out.println("Довжина кола: " + length);
    }

}