package edu.sabana.poob.shapes;

public class Circle extends Shape {

    private double radius;
    public static final double PI = Math.PI;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getDiameter() {
        return this.radius*2;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*PI;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*this.radius;
    }

    @Override
    public String toString()
    {
        if (this.radius%1==0)
        {
            return super.toString()+ " and radius "+(int)this.radius;
        }
        else {
            return super.toString()+ " and radius "+this.radius;
        }

    }
}
