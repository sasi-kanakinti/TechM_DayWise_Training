import java.sql.*;
import java.util.Scanner;

public class ECommerceOrderSystem {
    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            while (true) {
                System.out.println("\n1. Add Order\n2. Retrieve Order\n3. Update Order Status\n4. Delete Canceled Orders\n5. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Order ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Order Status: ");
                        String status = scanner.next();
                        addOrder(conn, id, status);
                        break;
                    case 2:
                        System.out.print("Enter Order ID: ");
                        int orderId = scanner.nextInt();
                        retrieveOrder(conn, orderId);
                        break;
                    case 3:
                        System.out.print("Enter Order ID: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter new Status: ");
                        String newStatus = scanner.next();
                        updateOrderStatus(conn, updateId, newStatus);
                        break;
                    case 4:
                        deleteCanceledOrders(conn);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    private static void addOrder(Connection conn, int id, String status) throws SQLException {
        String sql = "INSERT INTO orders (id, status) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, status);
            pstmt.executeUpdate();
            System.out.println("Order added successfully.");
        }
    }

    private static void retrieveOrder(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM orders WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Order ID: " + rs.getInt("id") + ", Status: " + rs.getString("status"));
            }
        }
    }

    private static void updateOrderStatus(Connection conn, int id, String status) throws SQLException {
        String sql = "UPDATE orders SET status=? WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, status);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Order updated successfully.");
        }
    }

    private static void deleteCanceledOrders(Connection conn) throws SQLException {
        String sql = "DELETE FROM orders WHERE status='Canceled'";
        try (Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " canceled orders deleted.");
        }
    }
}
