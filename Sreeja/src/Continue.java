public class Continue 
{
     public static void main(String[] args)
     {
        for (int i = 1; i <= 10; i++)   // for loop of i
        {

            if (i == 4 || i == 9)
             {
              continue;     //skip the statements
            }
            System.out.println(i);
        }
   }



    
}
