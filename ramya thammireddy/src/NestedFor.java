public class NestedFor 
{
    
        public static void main(String[] args) 
        {
           
           for (int i = 1; i <= 5; ++i) 
           {
     
              System.out.println("Outer loop iteration " + i);
     
              for (int j = 1; j <=2; ++j) 
              {
                 System.out.println("i = " + i + "; j = " + j);
              }
           }
        }
     
    
}
//pattern program
class Pattern 
{
    public static void main(String[] args) 
    {
       
       int rows = 5;
       
       for(int i = 1; i <= rows; ++i)
       {
           for(int j = 1; j <= i; ++j)
           {
              System.out.print(j + " ");
           }
           System.out.println("");
       }
    }
 }