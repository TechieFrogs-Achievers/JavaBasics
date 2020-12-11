public class ExceptionHandling15 
{
    public static void main(String[] args) 
    {
        try{
            int a[]={1,4,6,8};
            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array out of bounds exception:"+e);//array index of boundes exception
        }
        System.out.println("rest of the code");
    }
}
