package exercise1;

import java.util.Scanner;

public class Nhanvien {

    private String tenNhanVien;
    public static final double luongCoBan = 750000;
    private double heSoLuong;
    public static final double LUONG_MAX = 20000000;

    Scanner sc = new Scanner(System.in);

    public Nhanvien(){
        super();
    }

//    public void setHeSoLuong(double heSoLuong) {
//        this.heSoLuong = heSoLuong;
//    }
//
//    public void setLuongCoBan(double luongCoBan) {
//        this.luongCoBan = luongCoBan;
//    }
//
//    public void setTenNhanVien(String tenNhanVien) {
//        this.tenNhanVien = tenNhanVien;
//    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void information(){
        System.out.println("Nhap ten nhan vien");
        tenNhanVien = sc.nextLine();
        if(luongCoBan<1000 || luongCoBan > 2000){
            do {
                System.out.println("xin moi nhap lai muc luong co ban cua " + tenNhanVien);
                double luongCoBan = sc.nextDouble();
            }while (luongCoBan < 1000 || luongCoBan > 2000);
        }
        System.out.println("Nhap he so tang luong: ");
        heSoLuong = sc.nextDouble();
        if(heSoLuong<1 || luongCoBan > 1.5){
            do {
                System.out.println("xin moi nhap lai he so luong cua " + tenNhanVien);
                 heSoLuong = sc.nextDouble();
            }while (heSoLuong < 1 || heSoLuong > 1.5);
        }
    }

    public boolean tinhLuong(double heSoLuong){
        double luong;
        luong = heSoLuong * getLuongCoBan();
        if(luong > LUONG_MAX){
            System.out.println( "Nhan vien: " + getTenNhanVien() + " co he so luong khong hop le!!!");
            return false;
        }
        else return true;
    }

    public String inTTin(){
        return "Nhan vien: " + getTenNhanVien() + " co muc luong co ban la: " +
                getLuongCoBan() + ", he so tang luong la: " + getHeSoLuong()+ "=> luong = "
                + getHeSoLuong()*getLuongCoBan() + " $";
    }


    // có trao đổi vào ra hoặc có 1 sự kiện khác

    // ready => running để chờ đợi tài nguyên cpu cấp phát cho nó

// sử dụng api để đưa ra danh sách các tiến trình trong windows

}
