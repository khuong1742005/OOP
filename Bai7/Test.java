package Bai7;

public class Test {
    public static void main(String[] args) {
        ResizableCircle rz = new ResizableCircle(3);
        System.out.println("Radius before resize: " + rz.getRadius());
        rz.resize(4);
        System.out.println("Radius after resize: " + rz.getRadius());
        System.out.println("Area: " + rz.getArea());
        System.out.println("Perimeter: " + rz.getPerimeter());
    }
}
