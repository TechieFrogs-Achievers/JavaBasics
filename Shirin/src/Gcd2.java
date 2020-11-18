public class Gcd2 
{
    public static void main(String[] args)
     {
        
    int x = 12 , y = 225 ;
     int g = 1;
      
     for ( int i = 1 ; i <= x && i <= y ; i++ )
     {
         if ( x % i == 0 &&  y %  i == 0)
         
             g = i ;
        

         
     }
     System.out.println("  the gcd of x and y  is  " +x+ " " +y+  " = " +g);

     //while loop
      while (x != y)
      {
          if (x > y)
          {
              x = x-y;
          }
          else 
          {
              y = y-x;
          }
      }
      System.out.println(" the gcd value is :" +x);

    
}
}
