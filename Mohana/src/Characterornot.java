public class Characterornot 
{
    public static void main(String[] args) 
    { 

        char value = '5'; 

        //character or not  

       /* if(( value >= 'a' && value <= 'z' ) || ( value >= 'A' && value <= 'Z'))
        {
            System.out.println( " the value is character");
        } 
        else 
        {
            System.out.println( " Not a character " );
        } */ 

        //another method 

        if(( value >= 97 && value <= 122) || ( value >= 65 && value <= 90))
        {
            System.out.println( " The given value is alphabet "); 
        } 
        else 
        {
            System.out.println( " not a alphabet ");
        }
     
    }
    
}
