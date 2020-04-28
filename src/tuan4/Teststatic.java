package tuan4;

public class Teststatic {
    public static String monHon = "LT HDT";
    public static void printMonHoc(){
        System.out.println("Đây là môn LTHDT");
    }

    public static String getMonHon() {
        return monHon;
    }

}


// khi chương trình dùng quá nhiều bộ nhớ gây ra tràn stack thì phải sử dụng bố nhớ động
// s là 1 biến tham chiếu trên stack, giá trị của s là địa chỉ trên heap khi cấp phát cho đối tượng
// nếu khai báo 1 đối tượng t = s thì biến tham chiếu t cũng có giá trị là địa chỉ trên heap
// biến nguyên thủy được gán giá trị trực tiếp trên stack
// jupyter notebook
