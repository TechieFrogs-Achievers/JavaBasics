public class Continue
 {
     public static void main(String[] args)
      {
          //skip only particular value
          for(int i=0 ; i<=6 ; i++)
          {
              if(i==3)
              {
                  continue;
              }
              System.out.println(i);
          }

          //skip between values
          for(int j=0 ; j<=10 ; j++)
          {
              if(j>4 && j<9)
              {
                  continue;
              }
              System.out.println(j);
          }
         

     }
    
}
