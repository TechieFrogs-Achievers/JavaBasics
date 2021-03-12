package SqlConnection;

//importing packages
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Delete {

    public static void main(String[] p) throws SQLException {

        Connection c=null;
        Statement  s=null;
        //Registering driver with database details 
        String dbURL = "jdbc:sqlserver://sree\\sqlexpress;databaseName=sampleDB";
        String user = "sa";
        String pass = "neeraja";
        //Establishing connection
        c = DriverManager.getConnection(dbURL, user, pass);
        System.out.println("coneccction established");
        //create object for connection 
        s=c.createStatement();
        //Execute Queiry
        s.executeUpdate("Delete from Registration where age=20");
        //close Resources
        c.close();
        s.close();
    }
    
}
