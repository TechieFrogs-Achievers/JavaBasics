public class LogicalAndBitwiseoperators
{ 
    public static void main(String[] args) {
        
        int x = 20 ;
        int y = 15 ;
        int z = 10 ;
         
        //Logical && operator

        System.out.println( x > y && x < z); //true && false
        System.out.println( x > y && x > z); // true && true
        System.out.println( x < y && x < z ); // false
        System.out.println( x < y && x > z); // false

        //Bitwise & operator

        System.out.println( x > y & x < z ); //true & false 
        System.out.println( x > y & x > z ); // true & true
        System.out.println( x < y & x < z ); //false & false 
        System.out.println( x < y & x > z ); // false & true

        //Logical || operator 

        System.out.println( x > y || x < z ); //true 
        System.out.println( x < y || x < z ); //false
        
        //Bitwise | operator 

        System.out.println( x > y  | x < z ); //true | false 
        System.out.println( x < y | x < z );  //false | false
        System.out.println( x < y | x > z ); //false | true
        System.out.println( x > y | x > z ); // true | true 

        // || and | with increment operator 

        System.out.println( x < y || x++ < z); // false || false 
        System.out.println( x ); // 21
        System.out.println( x > y | x++ < z); // true | false
        System.out.println( x );
    }
    
}
