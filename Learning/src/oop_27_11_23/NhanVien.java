package oop_27_11_23;

public class NhanVien {

    //update 01_01_24
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static int soNhanVien = 0;
    private final double LUONG_MAX = 100000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soNhanVien++;
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

    static double tongLuong(NhanVien... nhanVien) {
        double tongLuong = 0;
        for(NhanVien nv : nhanVien) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Luis Suarez", 40000, 2);
        //nhanVien1.tangLuong(5.5);
        //nhanVien1.inThongTin();

        NhanVien nhanVien2 = new NhanVien("WS3 Eirudy", 50000, 4);
        NhanVien nhanVien3 = new NhanVien("Braska", 50000, 4);
        System.out.println(NhanVien.soNhanVien);
        System.out.println(tongLuong(nhanVien1, nhanVien2, nhanVien3));
    }

}
