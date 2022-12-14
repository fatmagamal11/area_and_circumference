/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.area_and_circumference;

import java.util.Scanner;

public class circle {

    private int choise;
    private double radius_of_circule;
    private double area;
    private double circumference;
    Scanner input = new Scanner(System.in);

    public circle(double radius_of_circule) {
        this.radius_of_circule = radius_of_circule;
//        System.out.println("hello");

    }

    public void choose_area_or_circumference() {
        System.out.println("please choose area or circumference for circle\n(1)area. \n(2)circumference.");
        choise = input.nextInt();

        switch (choise) {
            case 1:
                System.out.println("****Circle area****");
                area = 3.14 * radius_of_circule * radius_of_circule;
                System.out.println("the area of circle is :" + area);
                break;
            case 2:
                System.out.println("****Circle circumference****");
                circumference = 2 * 3.14 * radius_of_circule;
                System.out.println("the circumference of circle is :" + circumference);

                break;

        }
    }

}
