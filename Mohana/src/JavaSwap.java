public class JavaSwap 
{
    public static void main(String[] args) {
        
        int a = 10  , b = 20  ;
         
        // swaping of two numbers  without using temp variable 

       /*  a = a + b; //30
        b  = a - b ; //10
        a = a - b ; //20        

        System.out.println( a  +"\n" +b ); */

        //swaping of two numbers using temp variable 

        int tempvariable ; 
        
        
         tempvariable = a ;
           a = b ; 
         b = tempvariable ; 
         
         System.out.println( a + " \n " + b );



    }
    
}
