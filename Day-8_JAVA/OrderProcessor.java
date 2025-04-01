import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class OrderProcessor extends Thread {
    private BlockingQueue<String> orderQueue;
    private boolean running = true;

    public OrderProcessor(BlockingQueue<String> orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void shutdown() {
        running = false;
    }

    public void run() {
        while (running) {
            try {
                String order = orderQueue.take();
                System.out.println("Processing order: " + order);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> orderQueue = new LinkedBlockingQueue<>();
        OrderProcessor processor = new OrderProcessor(orderQueue);
        processor.start();

        for (int i = 1; i <= 5; i++) {
            orderQueue.put("Order " + i);
        }
        Thread.sleep(5000);
        processor.shutdown();
    }
}
