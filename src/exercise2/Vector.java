package exercise2;

public class Vector {
    private float td1;
    private float td2;
    private float td3;

    // vector trong khong gian 2 chieu
    public Vector(float a, float b){
        setTd1(a);
        setTd2(b);
    }

    // vector trong khong gian 3 chieu
    public Vector(float a, float b, float c){
        setTd1(a);
        setTd2(b);
        setTd3(c);
    }

    public void setTd1(float td1) {
        this.td1 = td1;
    }

    public void setTd2(float td2) {
        this.td2 = td2;
    }

    public void setTd3(float td3) {
        this.td3 = td3;
    }

    public float getTd1() {
        return td1;
    }

    public float getTd2() {
        return td2;
    }

    public float getTd3() {
        return td3;
    }

    //cong 2 vetor
    public void plus1(Vector a){
        float x = a.td1 + this.getTd1();
        float y = a.td2 + this.getTd2();
        Vector vector = new Vector(x, y);
        System.out.println("Tong 2 vector la: " + "(" + vector.td1 + ", " + vector.td2 + ")");
    }
    public float nhan(Vector a){
        td1 = a.td1 * this.getTd1();
        td2 = a.td2 * this.getTd2();
        return td1 + td2;
    }

}
