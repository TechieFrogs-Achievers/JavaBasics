package SqlConnection;

//importing required  packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] j) throws SQLException {
        Connection conn=null;
        Statement stmt = null;
        //Registering driver with database details
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://sree\\sqlexpress;databaseName=sampleDB",  "sa", "neeraja");
            stmt=conn.createStatement(); //creating object to the onnection

        //Queiry   
          String s="Create table Registration"+
                     "(Id Int,"+
                     "firstname varchar(80),"+
                     "lastName varchar(50),"+
                      "age int,"+
                      "primary key(Id))";
       
        //Executing Queiry
        stmt.executeUpdate(s);
         if(stmt.executeUpdate(s)==1){
           System.out.println("Created table in given database...");
         }
         else{
            System.out.println("not Created table in given database...");
          } 

        //Executing queiry to insert records into table
        int r = stmt.executeUpdate("insert into Registration(Id,firstname,lastName,age)" +
        "values(021,'James','taylor',20),(022,'neeraj','bejawada',21)");
        System.out.println("Rows inserted = "+ r);//r=no of rows inserted
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            conn.close();
            stmt.close();
        }
    }
    
}
