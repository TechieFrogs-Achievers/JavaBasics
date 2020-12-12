package Exceptions;

class Exceptions20
{
    public static void main(String[] args)
     {
             String num="100";
        try{
            int num1=Integer.parseInt (num) ;//try catch block without getting any exception
            System.out.println(num1);
             }
             catch(NumberFormatException e)
             {
             System.out.println(e+"is occured");
             }

             //try catch block gettig exception
         try{
            int n=Integer.parseInt (" durga") ;//exception occured due to string value
            System.out.println(n);
             }
             catch(NumberFormatException e)
              {
                System.out.println(e+"is occured");
              }     
        
    }
}
