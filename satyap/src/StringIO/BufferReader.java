package StringIO; // package
import java.io.*; //package for Scanner class

public class BufferReader // class
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader i=new InputStreamReader(System.in); //InpotStreamReader class
        BufferedReader br=new BufferedReader(i); // Buffered Reader class
        System.out.print("Enter Name:"); 
        String name=br.readLine(); // readLine() for String datataype by BufferedReader
        System.out.println(name);
        System.out.print("Enter ID:");
        int ID=br.read(); // read() for int datatype by BufferedReader
        System.out.println(ID);

    }
}
