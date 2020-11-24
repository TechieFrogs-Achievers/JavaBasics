public class Continue
 {
     public static void main(String[] args)
      {
          
          for(int i=0 ; i<=6 ; i++)
          {
              if(i==3) //value is 3
              {
                  continue; //continue keyword
              }
              System.out.println(i); //skip only particular value
          }

          
          for(int j=0 ; j<=10 ; j++)
          {
              if(j>4 && j<9) // value between 4 and 9
              {
                  continue;
              }
              System.out.println(j); //skip between values
          }
         

     }
    
}
