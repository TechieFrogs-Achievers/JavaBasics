public class LargestNumber 
{
    public static void main(String[] args)
     {
         float a=356.986f , b=5776.987f , c=5776.985f;
         if(a>=b && b>=c)
         {
             System.out.println("the largest num is : " +a);
        }
        else if (b>=c && c>=a)
        {
            System.out.println(" the largest num is :" +b);
        }
        else
        {
            System.out.println("thr largest num is :" +c);
        }
        
    }
    
}
