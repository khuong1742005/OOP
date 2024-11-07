package Chuong3.Bai8;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle()
    {
        super();
    }

    public Rectangle(String color, int length, int width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }

    public String toString()
    {
        return "Dien tich hinh vuong la: " + getArea() + " va co mau " + super.toString();
    }
}
