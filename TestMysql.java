import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMysql {
    public static void main(String[] args){
        System.out.println("Testing mySql Connection");
        loadDriver();
    }

    public static void loadDriver(){
        System.out.println("Loading mySql Driver");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("mySql CJ Driver Loaded With Success");
        } 
        catch (Exception ex) {
            System.out.println("Error Loading mySql CJ Driver: " + ex.getMessage());
        }
         
    }
}