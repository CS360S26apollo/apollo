package com.example.apollo;

public class Rhombus extends Shape {

    private double side;
    private double diagonal1;
    private double diagonal2;

    // Constructor
    public Rhombus(int x, int y, double side, double diagonal1, double diagonal2) {
        super(x, y);
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // Area = (d1 * d2) / 2
    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    // Perimeter = 4 * side
    public double getPerimeter() {
        return 4 * side;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " rhombus at (" + x + ", " + y + ")");
    }
}
