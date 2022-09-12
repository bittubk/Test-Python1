import java.sql.*;

public class OpeartionsOnDatabase {
    
    public static void main(String [] args) {
        insertPerson(1, "Ram", Date.valueOf("1999-01-01"), true, "Male");
        updatePerson(2, "Sam", Date.valueOf("2000-02-05"), false, "Male");
        deletePerson(3, "Tam", Date.valueOf("1998-03-21"), true, "Female");
        showPersons();
    }

    public static void showPersons() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaProject", "gurjot", "password@123");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from person");
            while (rs.next())
                System.out.println(rs.getInt("personId") + "  " + rs.getString("personName") + "  " + rs.getString("personGender") + " "
                        + rs.getDate("personDOB") + " " + rs.getBoolean("personIsMarried"));
            con.close();

        }
         
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void insertPerson(int personId, String personName, Date personDOB, boolean personIsMarried, String personGender) {
       try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaProject", "gurjot", "password@123");
        
            PreparedStatement stmt = con.prepareStatement("insert into person (personId, personName, personDOB, personIsMarried, personGender) values (?,?,?,?,?)");
 
            stmt.setInt(1, personId);
            stmt.setString(2, personName);
            stmt.setDate(3, personDOB);
            stmt.setBoolean(4, personIsMarried);
            stmt.setString(5, personGender);

            int i = stmt.executeUpdate();
            System.out.println(i + " record was inserted");
            con.close();

        } 
    
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void updatePerson(int personId, String personName, Date personDOB, boolean personIsMarried, String personGender) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaProject", "gurjot", "password@123");
     
            PreparedStatement stmt = conn.prepareStatement("update person set personName = ?, personDOB = ?, personIsMarried = ?, personGender = ?    where personId = ?");

            stmt.setString(1, personName);
            stmt.setDate(2, personDOB);
            stmt.setBoolean(3, personIsMarried);
            stmt.setString(4, personGender);
            stmt.setInt(5, personId);

            int i = stmt.executeUpdate();
            System.out.println(i + " record was updated");
            conn.close();

        } 
        
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deletePerson(int personId, String personName, Date personDOB, boolean personIsMarried, String personGender) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaProject", "gurjot", "password@123");
     
            PreparedStatement stmt = con.prepareStatement("delete from person where personId = ?");

            int i = stmt.executeUpdate();
            System.out.println(i + " record was deleted");
            con.close();

        } 
        
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }   
}