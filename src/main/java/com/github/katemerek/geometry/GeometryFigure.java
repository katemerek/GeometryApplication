package com.github.katemerek.geometry;


import com.github.katemerek.geometrylib.Rectangle;
import com.github.katemerek.geometrylib.Square;
import com.github.katemerek.geometrylib.Triangle;
import com.github.katemerek.geometryutil.GeometryConverter;
import com.github.katemerek.geometryutil.Rhombus;

public class GeometryFigure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Площадь треугольника: " + triangle.getArea());

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Длина диагонали: " + rectangle.getDiagonal());

        Square square = new Square(6);
        System.out.println("Площадь квадрата: " + square.getArea());

        Rhombus rhombus = new Rhombus(13, 10, 24);
        System.out.println("Периметр ромба: " + rhombus.getArea());

        GeometryConverter converter = new GeometryConverter();
        System.out.println("Перевод в метры: " + GeometryConverter.centimetersToMeters(rhombus.getArea()));
    }
}
