public class Continue1 
{
    public static void main(String[] args)  
    {
        for (int i = 1; i <=5; i++)
        {
            if (i==3)
            {
                continue;

            }
            System.out.println("the i value is " + i);
        }
        
    
    

// using  while loop
    int num = 5 ;
    while (num >= 1)
    {
        if (num ==2)
        {
            num --;
            continue ;

        }
        System.out.println("the num value is" + num );
        num --;
        
    }
  }
}

