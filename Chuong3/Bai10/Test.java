package Chuong3.Bai10;


public class Test {
    public static void main(String[] args)
    {
        HocVienDH dh = new HocVienDH();
        dh.nhap();
        HocVienLT lt = new HocVienLT();
        lt.nhap();
        System.out.println(dh);
        System.out.println(lt);
    }
}