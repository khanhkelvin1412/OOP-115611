package Thread;

class RunnableDemo extends Thread {
    private String threadName;
    private Thread t;
    public RunnableDemo(String name ){
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Running " + threadName);
        try{
            for(int i = 4; i > 0; i--){
                System.out.println("Thread : " + threadName + ", " + i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + "interrupted");
        }
        System.out.println("exiting " + threadName);
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            Thread t = new Thread(this, threadName);
            t.start();
        }
    }
}
class Test{
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Quả Bóng 1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("Quả bóng 2");
        r2.start();
    }
}