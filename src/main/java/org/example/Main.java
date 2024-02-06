package org.example;
import org.example.Figures.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3,3,3,2);
        Rectangle rectangle = new Rectangle(5,4);

        circle.computeArea();
        triangle.computePerimeter();
        rectangle.computeArea();

    }
}