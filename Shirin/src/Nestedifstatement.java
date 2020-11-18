public class Nestedifstatement 
{ 
    
    public static void main(String[] args)
     {
         
    int Distance1 = 400;// km
    int rs= 100;
    int persons = 1;//3 persons 
        
    if (Distance1 < 500 )
    {
        
     if (persons == 1)
     {
      System.out.println("the distance is less than 500 =" + rs);
     }
     else if (persons == 2)
      {
        rs = persons * rs ;
        System.out.println("the cost is " + rs);
      }
    }  

    else 
    {
     System.out.println( "the cost is not diaplay");
    }
    
    }
}
