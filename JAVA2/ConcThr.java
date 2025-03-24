/*
* ExecutorService -> Manage thread pool efficiently
* Callback and Future -> Run a task and return the result asynchronously
* CountDownLatch -> Synchronize threads by making them wait for other to complete
*/
 
//Executor [submit, shutdown]
 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class ConcThr{
    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(1);
        //max threads that i can have is 3
        //task
        Runnable task = ()->{
            System.out.println(Thread.currentThread().getName()+"is running");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        };
        //we have 3 threads but ill execute 5 process/task
        for(int i=0;i<5;i++){
            pool.submit(task);
        }
 
        //first 3 threads will execute 3 tasks in 2 sec
        //last 2 tasks will get executed by 2 threds for additional 2 sec
        //total time taken is 4 sec
        pool.shutdown();
    }
 
}
 