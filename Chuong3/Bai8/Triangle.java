package Chuong3.Bai8;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle()
    {
        super();
    }

    public Triangle(String color, int base, int height)
    {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return base * height;
    }

    public String toString()
    {
        return "Dien tich hinh tam giac la: " + getArea() + " va co mau " + super.toString();
    }
}
