package com.example.apollo;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(int x, int y, double base, double height) {
        super(x, y); // This satisfies the 'Shape' constructor requirement
        this.base = base;
        this.height = height;
    }

}