package Chuong3.Bai10;

import java.util.Scanner;

public class HocVienDH extends HocVien{
    private int soBuoi;
    private double donGia;

    public HocVienDH() {
        super();
    }
    public HocVienDH(String hoTen, String address, int loaiUuTien, String loaiChuongTrinh, int soBuoi, double donGia) {
        super(hoTen, address, loaiUuTien, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }
    public int getSoBuoi() {
        return soBuoi;
    }
    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so buoi: ");
        setSoBuoi(sc.nextInt());
        System.out.println("Nhap don gia: ");
        setDonGia(sc.nextDouble());
    }

    @Override
    public double hocPhi() {
        double hp = getDonGia() * getSoBuoi();
        if (getLoaiUuTien() == 1)
        {
            return hp -= 1000000;
        }
        else return hp -= 500000;
    }
    @Override
    public String toString() {
        return super.toString() + "soBuoi=" + soBuoi + ", donGia=" + donGia + ", hoc phi=" + hocPhi() + "]";
    }


}