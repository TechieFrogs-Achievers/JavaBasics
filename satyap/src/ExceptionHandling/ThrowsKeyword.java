package ExceptionHandling; //package for folder ExceptionHandling
import java.io.IOException; //package for IOException
import java.util.*; //package for scanner class
class ThrowsKeyword1  //class for program using throws keyword
{
    public void method() throws IOException //throws should specify only using methods
    {
        throw new IOException("Device Error"); //throw the exception using thro keyword and print the statement
    } 
    void method1(){ //method which contain try and catch blocks
    try{ //try block for contains exception
        method(); //exception
    }
    catch(Exception e)//catch block
    {
        System.out.println("Exception handling");
    }
}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//scanner class
        ThrowsKeyword1 t=new ThrowsKeyword1(); //object for class
        //t.method1(); //method calling by using obj reference
        //t.method();
        sc.close(); //scanner close

    }
}
