import java.util.concurrent.*;

class Task implements Runnable {
    private CountDownLatch latch;
    public Task(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Task completed");
        } catch (InterruptedException ignored) {}
        latch.countDown();
    }
}

public class CountdownTimer {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(new Task(latch));
        }
        latch.await();
        System.out.println("All tasks completed");
        executor.shutdown();
    }
}
