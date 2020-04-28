package exercise3;

public class HinhTron {


    private float banKinh;
    public final float PI = 3.14f;

    public HinhTron(float banKinh){
        setBanKinh(banKinh);
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public float dienTich(float banKinh){
        return PI * banKinh * banKinh;
    }
    public float chuVi(float banKinh){
        return 2*PI*banKinh;
    }



}

// phương thức khởi tạo 1 muốn gọi phương thức khởi tạo 2 thì phải dùng từ khóa this
// và phải thực hiện đầu tiên trong khối lệnh khởi tạo