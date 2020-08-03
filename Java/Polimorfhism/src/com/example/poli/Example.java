package com.example.poli;
import java.util.Scanner;
import java.lang.Math;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape rect = new Rectangle(2,3, "Rectangle");
        System.out.println("Area of rectangle: " + rect.area());
        rect.moveTo(1,2);

        Shape myRect = new Rectangle(5,8, "bebelin");
        System.out.println("Area of rectangle: " + myRect.area());
        myRect.moveTo(1,2);

        Circle circle = new Circle(5,"Circulin");
        circle.moveTo(4,5);

        JustAnExample noAccepted = new JustAnExample("Not accepted");

        polimor(circle);
        polimor(myRect);
        polimor(rect); //Note that rect is type Shape but with object Rectangle

       // polimor(noAccepted);
    }

    public static void polimor(Shape anyObject){
        System.out.println("Accepted by Polimorf: " + anyObject.objectName);
    }
}


abstract class Shape
{
    // declare fields
    String objectName = " ";

    Shape(String name)
    {
        this.objectName = name;
    }

    // declare non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    // abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}

class Rectangle extends Shape
{

    int length, width;

    // constructor
    Rectangle(int length, int width, String name)
    {

        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area()
    {
        return (double)(length*width);
    }
}

class Circle extends Shape
{
    float pi = 3.1416f;
    float circunference;

    public Circle(float circunference, String name){
        super(name);
        this.circunference = circunference;
    }


    @Override
    public double area() {
        return (double) pi * (Math.pow(circunference/2,2));
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }
}

class JustAnExample
{
    String name;

    public JustAnExample(String name){
        this.name = name;
    }
}
