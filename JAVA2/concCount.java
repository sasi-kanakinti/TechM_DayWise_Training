import java.util.concurrent.*;
import javax.security.auth.callback.Callback;
@SuppressWarnings("unused")
public class concCount{
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(3);
        Runnable worker=()->{
            System.out.println(Thread.currentThread().getName()+" Worker thread started");
            try{
                Thread.sleep(300);
                latch.countDown();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        };

        for(int i=0; i<5;i++)
        {
            new Thread(worker).start();
        }
        latch.wait(2);
        System.out.println("All threads are finished");
    }
}