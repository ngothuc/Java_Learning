package oop_02_01_24;

public class NhanVien {

    private String tenNhanVien;
    private double heSoLuong;
    public static final double LUONG_CO_BAN = 750000;
    public static final double LUONG_MAX = 20000000;

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public NhanVien(String tenNhanVien, double heSoLuong) {
        this(tenNhanVien);
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return this.heSoLuong * LUONG_CO_BAN;
    }

    public boolean tangLuong(double heSoLuongTangThem) {
        if(this.tinhLuong() + heSoLuongTangThem * LUONG_CO_BAN < LUONG_MAX) {
            this.heSoLuong = heSoLuongTangThem + this.heSoLuong;
            return true;
        }
        return false;
    }

    public void inThongTin() {
        System.out.println(this.tenNhanVien + " " + this.tinhLuong());
    }

}
