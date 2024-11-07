package Bai7;

public class Circle implements GeometriObject{
    protected double radius = 1.0;

    public Circle(double radius){
        this.radius = radius;
    };

    public double getRadius()
    {
        return radius;
    }

    @Override
    public double getPerimeter()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }

    @Override
    public double getArea()
    {
        double s = Math.PI * radius * radius;
        return s;
    }
}
