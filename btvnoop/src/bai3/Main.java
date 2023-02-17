package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the width:");
        double width = new Scanner(System.in).nextInt();
        System.out.print("Enter the height:");
        double height = new Scanner(System.in).nextInt();
        System.out.print("Enter the color:");
        String color = new Scanner(System.in).nextLine();
        Rectangle rectangle = new Rectangle(width, height, color);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.perimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.area());

    }
}
