

public class ExceptionHandling17 
{
    public static void main(String[] args)
     {
        try{
            int a[]={1,2,3,4,5,6,7,8,9};//try block
            System.out.println("arraya list"+a[11]);
        }
        catch(ArithmeticException e)//catch block
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)//catch block
        {
            System.out.println("ok"+e);
        }
        catch(Exception e)//catch block
        {
            System.out.println(e);
        }
        {
        throw new ArithmeticException("run this code");//throw block
        }
        
    }
    
}
