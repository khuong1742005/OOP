package Bai10;

import java.util.Scanner;

public abstract class HocVien{
    private String hoTen;
    private String address;
    private int loaiUuTien;
    private String loaiChuongTrinh;
    
	public HocVien() {
	}

	public HocVien(String hoTen, String address, int loaiUuTien, String loaiChuongTrinh) {
		super();
		this.hoTen = hoTen;
		this.address = address;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLoaiUuTien() {
		return loaiUuTien;
	}

	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}

	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}

	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		setHoTen(sc.nextLine());
		System.out.println("Nhap dia chi: ");
		setAddress(sc.nextLine());
		System.out.println("Nhap loai uu tien: ");
		setLoaiUuTien(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap loai chuong trinh: ");
		setLoaiChuongTrinh(sc.nextLine());
	}

	public abstract double hocPhi();

	@Override
	public String toString() {
		return "HocVien [hoTen=" + hoTen + ", address=" + address + ", loaiUuTien=" + loaiUuTien + ", loaiChuongTrinh="
				+ loaiChuongTrinh + ", ";
	}

    
}