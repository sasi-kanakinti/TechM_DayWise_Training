import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Flight {}
class BookingSystem {
    private static ExecutorService executor = Executors.newFixedThreadPool(5);

    public static Future<List<Flight>> searchFlights() {
        return executor.submit(() -> {
            Thread.sleep(2000);
            return new ArrayList<>();
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<List<Flight>> futureFlights = searchFlights();
        System.out.println("Fetching flights...");
        System.out.println("Flights found: " + futureFlights.get());
        executor.shutdown();
    }
}