package exercise3;

public class TestHinhHoc {
    public static void main(String[] args) {
        Hinhvuong hv = new Hinhvuong(4);
        Hinhvuong hr = new Hinhvuong(4);
        hv = hr;
        System.out.println(hv==hr);
    }
}
