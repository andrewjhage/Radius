/*
 * Andree Hage
 * 11/7/2022
 * 4.1 Program that calculates the area of a pentagon
 */

import java.util.Scanner;

public class Radius{
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter the vertex of the pentagon: ");
            double vertex = keyboard.nextDouble();
            double sideS,area;
            sideS =2*vertex*Math.sin(Math.PI/5);
            area = (5*(sideS*sideS))/(4*Math.tan(Math.PI/5));
            System.out.printf("The area is: %.2f",area);
        }
        
    }
}