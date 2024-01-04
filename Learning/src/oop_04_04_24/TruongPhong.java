package oop_04_04_24;

public class TruongPhong extends NhanVien{
    private double phuCap;
    private double soNamDuongChuc;

    @Override
    public double tinhLuong() {
        double luong = super.tinhLuong();
        luong += phuCap;
        return luong;
    }
}
