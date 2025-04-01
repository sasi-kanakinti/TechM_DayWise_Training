import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class CSVToDatabaseImporter {
    private static final String URL = "jdbc:mysql://localhost:3306/bulkdata";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    private static final String CSV_FILE = "data.csv";

    public static void main(String[] args) {
        String sql = "INSERT INTO records (name, age, email) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {

            conn.setAutoCommit(false);
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                pstmt.setString(1, data[0]);
                pstmt.setInt(2, Integer.parseInt(data[1]));
                pstmt.setString(3, data[2]);
                pstmt.addBatch();

                if (++count % 1000 == 0) {
                    pstmt.executeBatch();
                    conn.commit();
                }
            }
            pstmt.executeBatch();
            conn.commit();
            System.out.println("Data imported successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
