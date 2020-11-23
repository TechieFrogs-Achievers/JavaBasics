import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                Formatter formatter = new Formatter(); 
                if(x>=-128 && x<=127)
                {
                formatter.format("* byte %n* short %n* int %* long ");
                System.out.println(formatter);
                }
                else if(x>=-32768 && x<=32768)
                {
                formatter.format("* short %n* int %* long ");
                System.out.println(formatter);
                }
                else if(x>=-2147483648 && x<=((2^63)-1))
                {
                formatter.format("* int %* long ");
                System.out.println(formatter);
                }
                else
                {
                formatter.format("* long ");
                System.out.println(formatter);
                }
                
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




