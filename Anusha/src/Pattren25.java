public class Pattren25 
{
  public static void main(String[] args) 
  {
    int rows=5,ch=65,currentrow=1,counter=1;
    for (int i=1; i<= rows; i++)
      {
          if (i % 2 == 0) 
          {
              int reverse = currentrow + counter - 1;
              for (int j = 0; j<i; j++)
              {
                  System.out.print((char) (reverse + ch -1)+" ");
                  reverse--;
                  counter++;
              }
          }
          else
          {
              for (int j = 1; j<=i; j++)
              {
                  System.out.print((char) (counter + ch - 1)  +" ");
                  counter++;
              }
          }
          System.out.println();
          currentrow++;
      } 
  }  
}
