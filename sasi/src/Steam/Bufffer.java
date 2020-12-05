package Steam;
import java.io.*;
public class Bufffer 
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(i);
        String name= br.readLine();
        System.out.println("name is:"+name);
        String anothername = br.readLine();
        System.out.println("name is:"+anothername);
        int Id=br.read();
        System.out.println("identitynumber"+Id);
        
    }
}
