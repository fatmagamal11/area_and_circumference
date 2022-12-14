package com.mycompany.area_and_circumference;

import java.util.Scanner;

public class triangle {

    private double triSide1, triSide2, triSide3;
    private int choise;
    private double area;
    private double circumference;
    Scanner input = new Scanner(System.in);

    public triangle(double triSide1, double triSide2, double triSide3) {
        this.triSide1 = triSide1;
        this.triSide2 = triSide2;
        this.triSide3 = triSide3;
//        System.out.println("hi");
    }

    public void choose_area_or_circumference() {
        circumference = (triSide1 + triSide2 + triSide3);

        System.out.println("please choose area or circumference for triangle\n(1)area. \n(2)circumference.");
        choise = input.nextInt();

        switch (choise) {
            case 1:
                System.out.println("****triangle area****");
                double Area = Math.sqrt(circumference / 2 * (circumference / 2 - triSide1) * (circumference / 2 - triSide1) * (circumference / 2 - triSide1));
                System.out.println("The area of the triangle = " + (Area));
                break;
            case 2:
                System.out.println("****triangle circumference****");
                System.out.println("The circumference of the triangle = " + circumference);
                break;

        }
    }
}
