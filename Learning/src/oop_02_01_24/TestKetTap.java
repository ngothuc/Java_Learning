package oop_02_01_24;

//Xong bai 6

public class TestKetTap {
    


    public static void main(String[] args) {
        PhongBan pb = new PhongBan("Vien CNTT - TT");

        pb.themNhanVien(new NhanVien("Pham Quang Dung", 5));
        pb.themNhanVien(new NhanVien("Dinh Viet Sang", 4));
        pb.themNhanVien(new NhanVien("Ngo Thanh Trung", 3));
        pb.themNhanVien(new NhanVien("Nguyen Kim Khanh"));

        pb.inThongTin();
    }
}
