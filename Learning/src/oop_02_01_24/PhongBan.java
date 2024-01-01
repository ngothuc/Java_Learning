package oop_02_01_24;

public class PhongBan {

    private String tenPhongBan;
    private byte soNhanVien;
    public static final int SO_NV_MAX = 100;
    private NhanVien[] dsnv;

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = 0;
        this.dsnv = new NhanVien[SO_NV_MAX];
 
    }

    public boolean themNhanVien(NhanVien nv) {
        if(this.soNhanVien + 1 < SO_NV_MAX) {
            this.dsnv[this.soNhanVien++] = nv;
            return true;
        }
        return false;
    }

    public NhanVien xoaNhanVien() {
        if(this.soNhanVien < 1) {
            return null;
        }
        NhanVien tmp = this.dsnv[this.soNhanVien];
        this.dsnv[this.soNhanVien] = null;
        this.soNhanVien--;
        return tmp;
    }

    public double tongLuong() {
        double tongLuong = 0;

        for(NhanVien nv : this.dsnv) {
        	if(nv != null) tongLuong += nv.tinhLuong();
        }

        return tongLuong;
    }

    public void inThongTin() {
        System.out.println("Phong ban: " + this.tenPhongBan);
        for(NhanVien nv : this.dsnv) {
            if(nv != null) nv.inThongTin();
        }
        System.out.println("Tong luong: " + this.tongLuong());
    }
}
