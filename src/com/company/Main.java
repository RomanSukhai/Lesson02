package com.company;

public class Main {

    public static void main(String[] args) {
        Recangle a =new Recangle();
        Recangle b =new Recangle(600,700);

        System.out.println("Площа прямокутника = " + a.height*a.whith + " px");
        System.out.println("Площа прямокутника = " + 2*(a.height+a.whith) + " px");
        System.out.println(" ");
        System.out.println("Площа прямокутника = " + b.height*b.whith + " px");
        System.out.println("Площа прямокутника = " + 2*(b.height+b.whith) + " px");


        Circle.SquareCircle(20.4,40.3);


    }
}
