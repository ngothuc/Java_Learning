package oop_27_11_23;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private final double LUONG_MAX = 100000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    boolean tangLuong(double x) {
        if((this.heSoLuong + x) * luongCoBan > LUONG_MAX) {
            return false;
        }

        this.heSoLuong += x;

        return true;
    }

    double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    void inThongTin() {
        System.out.println("Ten Nhan Vien: " + this.tenNhanVien);
        System.out.println("Luong: " + this.tinhLuong());
    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Luis Suarez", 40000, 2);
        nhanVien.tangLuong(5.5);
        nhanVien.inThongTin();
    }

}
