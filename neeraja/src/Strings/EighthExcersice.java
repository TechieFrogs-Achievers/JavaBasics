package Strings;

class Numeric{
    //instance method
     public boolean isNumeric(String str){
         
            try {  
             //cheking string is double or not
              Double.parseDouble(str);  
              return true;
            } 
            catch(Exception e){  
              return false;  
            }  
          }
     }



public class EighthExcersice {
    public static void main(String[] j){
    //instantiation of numeric class
     Numeric n=new Numeric();
     System.out.println(n.isNumeric("f"));//(int,float,long,double)
    }
    
}
