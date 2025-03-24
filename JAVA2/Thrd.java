class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}

public class Thrd{
    public static void main(String[] args)
    {
       MyThread t = new MyThread();
        t.start(); // starts the execution of MyThread
        //System.out.println("Main Thread"); // continues to execute in the main thread
    }
}