package NguyenLy;

public class Critical extends Thread{
    private double a = 0, b = 0;

    public void luong1() {
        a++;
    }
    public void luong2(){
        b++;
    }

    public static void main(String[] args) {
        Critical critical = new Critical();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                critical.luong1();
            }
        };
        thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                critical.luong2();
            }
        };
        thread2.start();
        if(critical.b < critical.a && critical.a <(critical.b +1)){
            System.out.println("Stop!!!");
            System.out.println("a = " + critical.a);
            System.out.println("b = " + critical.b);
        }
    }
}
