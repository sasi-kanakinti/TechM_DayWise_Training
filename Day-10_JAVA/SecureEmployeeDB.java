import java.sql.*;
import java.util.Scanner;

public class SecureEmployeeDB {
    private static final String URL = "jdbc:mysql://localhost:3306/employees";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n1. Add Employee\n2. Search Employee\n3. Update Salary\n4. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Email: ");
                        String email = scanner.next();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        addEmployee(conn, name, email, salary);
                        break;
                    case 2:
                        System.out.print("Enter Name or Email to search: ");
                        String searchKey = scanner.next();
                        searchEmployee(conn, searchKey);
                        break;
                    case 3:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter New Salary: ");
                        double newSalary = scanner.nextDouble();
                        updateSalary(conn, id, newSalary);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addEmployee(Connection conn, String name, String email, double salary) throws SQLException {
        String sql = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setDouble(3, salary);
            pstmt.executeUpdate();
            System.out.println("Employee added successfully.");
        }
    }

    private static void searchEmployee(Connection conn, String key) throws SQLException {
        String sql = "SELECT * FROM employees WHERE name=? OR email=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, key);
            pstmt.setString(2, key);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email") + ", Salary: " + rs.getDouble("salary"));
            }
        }
    }

    private static void updateSalary(Connection conn, int id, double salary) throws SQLException {
        String sql = "UPDATE employees SET salary=? WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, salary);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Salary updated successfully.");
        }
    }
}
