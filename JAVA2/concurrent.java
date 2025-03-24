import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class concurrent{
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(3);
        Runnable task=()->{
            System.out.println(Thread.currentThread().getName()+" is running");
        };
        for(int i=0;i<5;i++){
            executor.submit(task);
        }
        executor.shutdown();
    }
}