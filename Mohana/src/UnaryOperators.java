public class UnaryOperators
 {
    public static void main(String[] args) 
    {
        //Unary operator ++ and --

        int value = 20 ;

        //preincrement

        System.out.println( ++value ); //21
        System.out.println( value ); //21

        //predecrement 

        System.out.println( --value ); //20
        System.out.println( value ); //20

        //postincrement 
        
        System.out.println( value++ ); //20
        System.out.println( value ); //21


        //postdecrement 

        System.out.println( value-- ); //21
        System.out.println( value  ); //20 

        //unary operator ~ and !
            
        int cost = -30 ;
        boolean isJavaEasy = true;
        boolean isJavaHard = false;
       
        System.out.println( ~value ); //21
        System.out.println( ~ cost ); //29
        System.out.println( !isJavaEasy ); //false
        System.out.println( !isJavaHard ); //true



    }
    
}
