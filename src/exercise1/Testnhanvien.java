package exercise1;

import java.util.Scanner;

public class Testnhanvien {

    public static void main(String [] args){
        int soNhanVien;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so nhan vien: ");
        soNhanVien = Integer.parseInt(sc.nextLine());

        Nhanvien nhanviens[] = new Nhanvien[soNhanVien];

        for(int i = 0; i<soNhanVien; i++){
            Nhanvien nhanvien = new Nhanvien();
            System.out.println("Nhap vao thong tin cua nhan vien thu " + (i+1) + " :");
            nhanvien.information();
            nhanviens[i] = nhanvien;
        }
        for(int i = 0; i<nhanviens.length; i++ ){
            double heSoLuong = nhanviens[i].getHeSoLuong();
            if(nhanviens[i].tinhLuong(heSoLuong)){
                System.out.println(nhanviens[i].inTTin());
            }
            else System.out.println("Luong cua " + nhanviens[i].getTenNhanVien()+ " = "
                    + nhanviens[i].getLuongCoBan() + " $");
        }
    }
}
