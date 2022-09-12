import java.sql.*;

public class ConnectionMysqlStudent {

    public static void main(String [] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/javaProject";
            String user = "gurjot";
            String password = "password@123";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
    
            while (rs.next())
                System.out.println(rs.getInt("studentId") + " --- " + rs.getString("studentRollNo") + " --- " + rs.getString("studentName") + " --- " + rs.getString("studentCourse") + " --- " + rs.getString("studentPhoneNo"));
            conn.close();
        }
       
        catch (Exception ex) {
            System.out.println("Error In Connection " + ex.getMessage());
        }
        
    }
}