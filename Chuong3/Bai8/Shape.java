package Chuong3.Bai8;

public abstract class Shape {
    private String color;

    public Shape(){};
    public Shape(String color)
    {
        this.color = color;
    }

    public abstract double getArea();

    public String toString()
    {
        return "mau " + color;
    }
}
