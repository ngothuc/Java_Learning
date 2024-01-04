package oop_04_04_24;

public class NhanVien {

    protected String tenNhanVien;
    protected double heSoLuong;

    public final double LUONG_CO_BAN = 750000;
    public final double LUONG_MAX = 20000000;

    public double tinhLuong() {
        return heSoLuong * LUONG_CO_BAN;
    }

    public boolean tangLuong(double heSoTang) {
        if(this.tinhLuong() + heSoTang * LUONG_CO_BAN <= LUONG_MAX) {
            heSoLuong += heSoTang;
            return true;
        }
        return false;
    }

    public void inTTin() {
        System.out.println(tenNhanVien + tinhLuong());
    }

}
