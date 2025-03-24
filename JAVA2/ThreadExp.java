public class ThreadExp {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("Thread1 Running...");
            try {Thread.sleep(3000);}catch (InterruptedException e) {}});
        Thread t2=new Thread(()->{System.out.println("Thread2 Running...");});
            t1.start();
            t1.join();
            t2.start();
    }
}
