/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.area_and_circumference;

/**
 *
 * @author Tweety
 */
public class Area_and_circumference {

public static int sum(int x,int y){
return x+y;
} 
    public static void main(String[] args) {
        triangle t1=new triangle(2,5,7);
        t1.choose_area_or_circumference();
        circle c1 = new circle(14);
        c1.choose_area_or_circumference();
        

    }
}
