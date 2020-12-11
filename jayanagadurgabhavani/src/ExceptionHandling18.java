public class ExceptionHandling18 
{
    public static void main(String[] args) 
    {
        try{
            try{
                int a=12,b=0;
                System.out.println(a/b);//try block
            }
            catch(ArithmeticException e)
            {
                System.out.println("ArithmeticException");//catch block
            }
        
            try{
               int  a[]={1,2,3,4,5};
                System.out.println(a[6]);//try block
            }
        
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("array out of the boundrs");//catch block
            }
        }
        catch(Exception e)
        {
            System.out.println(e);//catch block
        }
        System.out.println("rest of the code...");
    }
}
