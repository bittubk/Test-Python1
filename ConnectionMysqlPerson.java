import java.sql.*;

public class ConnectionMysqlPerson {

    public static void main(String [] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/javaProject";
            String user = "gurjot";
            String password = "password@123";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from person");
        
            while (rs.next())
                System.out.println(rs.getInt("personId") + " --- " + rs.getString("personName") + " --- " + rs.getString("personDOB") + " --- " + rs.getString("personIsMarried") + " --- " + rs.getString("personGender"));
            conn.close();
        }

        catch (Exception ex) {
            System.out.println("Error In Connection " + ex.getMessage());
        }
        
    
    }
}