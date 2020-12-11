public class ExceptionHandling16 
{
    public static void main(String[] args) 
    {
        try{
            int a[]={-1,-2,-3,4,5,6,7};//negative size of exception
            System.out.println(a[7]);
        }
        catch(NegativeArraySizeException e){
            System.out.println("negative array"+e);
        }
        System.out.println("rest of the code.....");
    }
}
