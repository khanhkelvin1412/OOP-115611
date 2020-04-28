package tuan5;

import java.util.Scanner;

public class NhanVien {

    private String tenNhanVien;
    private double heSoLuong;
    public static final double luongCoBan = 750000;
    public static final double LUONG_MAX = 20000000;


    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }


    public boolean tangLuong(double heSoLuong){
        double luong = luongCoBan * heSoLuong;
        if(luong > LUONG_MAX){
            return false;
        }
        else return true;
    }

    public double tinhLuong(){
        NhanVien nhanVien = new NhanVien();
        if(nhanVien.tangLuong(nhanVien.heSoLuong)){
            return luongCoBan + luongCoBan*heSoLuong;
        }
        else return luongCoBan;
    }

    public String inTTin(){
        NhanVien nhanVien = new NhanVien();
        return "Nhan vien" + nhanVien.getTenNhanVien() + "co muc luong la: " + nhanVien.tinhLuong();
    }

}
