package exercise3;

public class Hinhvuong {
    private float canh;

    public Hinhvuong(float canh){
        setCanh(canh);
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    public float chuVi(float canh){
        return 4 * canh;
    }
    public float dienTich(float canh){
        return canh * canh;
    }
}

