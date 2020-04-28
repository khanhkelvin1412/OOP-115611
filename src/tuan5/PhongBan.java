package tuan5;

public class PhongBan {

    private  String tenPhongBan;
    private NhanVien dsnv [];
    private byte soNhanVien;
    public static final double SO_NV_MAX = 100;

    public boolean themNhanVien(NhanVien nhanVien){
        if(soNhanVien < SO_NV_MAX){
            dsnv[soNhanVien] = nhanVien;
            soNhanVien++;
            return true;
        }
        else return false;
    }

    public NhanVien xoaNV(){
        if(soNhanVien > 0){
            NhanVien deleteNV = dsnv[soNhanVien-1];
            dsnv[soNhanVien-1] = null;
            soNhanVien--;
            return deleteNV;
        }
        else return null;
    }

    public double tongLuong(){
        double salary = 0;
        for(int i = 0; i < dsnv.length; i++){
            salary += dsnv[i].tinhLuong();
        }
        return salary;
    }
    public void inTTin(){
        for (int i = 0; i<dsnv.length; i++){
            dsnv[i].inTTin();
        }
    }
}
