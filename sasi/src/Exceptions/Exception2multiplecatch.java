package Exceptions;

import java.util.Scanner;

public class Exception2multiplecatch 
{
    public static void main(String[] args) 
    {
        int a, b, result;
        Scanner sc =new Scanner(System.in); //input user
         a=sc.nextInt(); //read the elm
         b=sc.nextInt();
         //tryblock           
          try  
          {
               result=a/b;
               System.out.println(result);
        }    
        //catch block
        catch(ArithmeticException e){  
            System.out.println(e);  
        }    
        catch(ArrayIndexOutOfBoundsException e){  
            System.out.println(e);  
        }    
        catch(Exception e){  
            System.out.println(e);
        }
        sc.close();
    }
}
