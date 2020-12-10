package StringExamples;

class  Test
{
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

   public class Numeric2 {
    public static void main(String[] j){
    //instantiation of numeric class
     Test n=new Test();
     System.out.println(n.isNumeric("f"));//(int,float,long,double)
    }
    
}
