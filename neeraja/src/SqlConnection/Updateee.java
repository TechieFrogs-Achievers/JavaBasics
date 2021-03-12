package SqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updateee {
    public static void main(String[] args) throws SQLException {
         
        Connection conn = null;
        try {
            //code to establish connection
            
            String dbURL = "jdbc:sqlserver://sree\\sqlexpress;databaseName=Refurbishment";
            String user = "sa";
            String pass = "neeraja";
            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("coneccction established");

            //writing queiry to manipulate data in the table
            String s="update users set  passwordd=? where userEmail=?";

            //Scanner class accepting updating values from user
            Scanner sc=new Scanner(System.in);
            System.out.println("enter password");
            String passwordd=sc.next();
            System.out.println("enter Email");
            String mail=sc.next();

            //PreparedStatement to make use of setter methods
            PreparedStatement st=conn.prepareStatement(s);
            st.setString(1, passwordd);
            st.setString(2, mail);

            //execute queiry method to execute queiry
            int x=st.executeUpdate();
            sc.close();//closing scanner class

            if(x==1){
                System.out.println("record updated");
            }
            else{
                System.out.println("record  not  updated");
           
            }

        }   //catch block to catch xceptions
            catch(SQLException e)
            {
                System.out.print(e);
            }
            //finlly block to close database connection
            finally{
                conn.close();
            }
        }
    
}
