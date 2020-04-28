package exercise2;

public class Test {

    public static void main(String[] args) {
        Vector vector1 = new Vector(3, 5);
        Vector vector2 = new Vector(4, 6);

        // tổng hai vector
        vector1.plus1(vector2);

        // tích 2 vector
        float m = vector1.nhan(vector2);
        System.out.println("tich vo huong 2 vector la: " + m );


    }
}
