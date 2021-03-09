package SqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
         
        Connection conn = null;
        try {

            String dbURL = "jdbc:sqlserver://sree\\sqlexpress;databaseName=Refurbishment";
            String user = "sa";
            String pass = "neeraja";
            conn = DriverManager.getConnection(dbURL, user, pass);
            //System.out.println("coneccction established");
            String s = "select * from Users";
            Statement st = conn.createStatement();//method to create object
            ResultSet r=st.executeQuery(s);//executing queiry 
            while(r.next()==true)
            {
                int ID=r.getInt(1);
                String usename=r.getString(2);
                String PASSWORDD=r.getString(3);
                String userEmail=r.getString(4);
                System.out.println(ID+"    "+usename+"    "+PASSWORDD+"    "+userEmail);
                }
                conn.close();
            
           
           }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    
}
