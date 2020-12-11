package Exceptions;

public class StringNumeric 
{
   public static void main(String[] args) 
   {
       //instantiation of numeric class
      Numeric n=new Numeric();
      System.out.println(n.isNumeric("f"));//(int,float,long,double)

   } 
}
class Numeric 
{
    //instance method
    public boolean isNumeric(String str){

        try {  
         //cheking string is int or not
          Integer.parseInt(str);  
          return true;
        } 
        catch(Exception e){  
          return false;  
        }  
      }
 }
