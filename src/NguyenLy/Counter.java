package NguyenLy;

public class Counter{
    private static double count = 5;

    public synchronized double sum() {
        int sum = 0;
        while (count < 10) {
            count++;
            sum += count;
        } return sum;
    }
    public synchronized double multiplication(){
        int sub = 0;
        while (count > 2){
            sub += count;
            count--;
        } return sub;
    }
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread thread1 = new Thread(){
            public void run(){
                System.out.println("Tổng = " + counter.sum());
//                counter.sum();
            }
        };
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread thread2 = new Thread(){
            public void run() {
                System.out.println("Tích = " + counter.multiplication());
//                counter.multiplication();
            }
        };
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
