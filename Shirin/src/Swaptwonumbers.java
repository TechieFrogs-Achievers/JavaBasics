public class Swaptwonumbers 
{
    public static void main(String[] args) 
    { 
        // using temporary variable
        int x = 5;
        int y = 9;
        int t;
        System.out.println("before swapping " +x +" " +y);
        t = x;
        x = y;
        y = t;
        System.out.println("after swapping " + x  +" " +y);


        // without using temporary variable 

         float   s = 12.0f ;
         float   b = 13.0f ;
        System.out.println(" before swapping " +s +" " +b);
        s =  s+b;
        s = s+b;
        b = s-b ;
        System.out.println("after swapping " +s +" " +b);


    }
    
}
