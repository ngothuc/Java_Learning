package oop_04_04_24;

public class GiamDoc extends NhanVien implements QuanLy {

    private double phuCap;
    public double loiNhuanCongTy;

    @Override
    public double tinhLuong() {
        double luong = super.tinhLuong();
        luong = luong + phuCap + tinhHoaHong();
        return luong;
    }

    @Override
    public double tinhHoaHong() {
        return 0.05 * loiNhuanCongTy;
    }
}
