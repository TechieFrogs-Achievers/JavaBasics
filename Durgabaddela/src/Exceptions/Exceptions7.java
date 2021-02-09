package Exceptions;

import java.io.IOException;

public class Exceptions7 
{
    public static void main(String[] args) {
        
    
    
    try
    { 

      ArithmeticException a = new ArithmeticException("getting exception"); 

      a.initCause(new IOException("main exception which is actual cause")); //main cause exception

      throw a; //throws the actual exception
    } 

    catch(ArithmeticException a) 
    { 

      System.out.println(a); 
      System.out.println(a.getCause());//calling the occuring exception 
    } 
}
}
