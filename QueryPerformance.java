import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryPerformance {

    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            long startTime = System.currentTimeMillis();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM employee WHERE department = 'IT'"
            );

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Execution Time (ms): " + (endTime - startTime));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
