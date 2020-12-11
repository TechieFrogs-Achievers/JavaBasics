package Exceptions;
//showing numberformat exception
public class Numberformat {

    public static void main(String args[])
    {
       try{
      int num=Integer.parseInt ("XYZ") ;
      String a="xh23";
      String b="20";
      
      System.out.println(num);
      System.out.println(a+b);
       }
       ///exception handler
       catch(NumberFormatException e){
       System.out.println("Number format exception occurred");
        }
         ///exception handler
         catch(Exception e) {
            System.out.println("generic Exception ");
         }
    }
    
}
