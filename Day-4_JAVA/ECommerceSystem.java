package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}


class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

public class ECommerceSystem {
    private static Map<String, Integer> products = new HashMap<>();

    static {
        products.put("Laptop", 5);
        products.put("Phone", 3);
        products.put("Headphones", 10);
    }

    public static void placeOrder(String product, int quantity) throws ProductNotFoundException, OutOfStockException {
        if (!products.containsKey(product)) {
            throw new ProductNotFoundException("Error: Product '" + product + "' not found.");
        }

        int stock = products.get(product);
        if (quantity > stock) {
            throw new OutOfStockException("Error: '" + product + "' is out of stock. Only " + stock + " left.");
        }

        
        products.put(product, stock - quantity);
        System.out.println("Order placed successfully! " + quantity + " " + product + "(s) purchased.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        
            System.out.print("Enter product name: ");
            String product = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
        
            placeOrder(product, quantity);

        } catch (NumberFormatException | ProductNotFoundException | OutOfStockException e) {
        
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
