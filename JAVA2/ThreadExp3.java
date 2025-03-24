class Counter{
    int count=0;
    void increament(){
        synchronized(this){
            count++;
        }
    }
}
public class ThreadExp3{
    //chain multiple threads together
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{for(int i=0;i<5;i++)counter.increament();});
        Thread t2 = new Thread(()->{for(int i=0;i<5;i++)counter.increament();});
        t1.start();
        t2.start();
        t1.join();
        t2.join();
      
       System.out.println("Final Count:"+counter.count);
    }
}