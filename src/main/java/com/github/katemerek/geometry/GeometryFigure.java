package com.github.katemerek.geometry;


import com.github.katemerek.geometrylib.Rectangle;
import com.github.katemerek.geometrylib.Triangle;

public class GeometryFigure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Площадь треугольника: " + triangle.getArea());

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Периметр квадрата: " + rectangle.getPerimeter());
        System.out.println("Длина диагонали: " + rectangle.getDiagonal());
    }
}
