package ExceptionHandling;

public class Exception18 
{
       public static String display(String play, String games)    
       {
           if(play== null)      //checks the condition
               throw new IllegalArgumentException("The play cann't be null:");   //if it is true then throws the exception
            
           if(games== null)
               throw new IllegalArgumentException("The games cann't be null:");    
            
           return play + " " + games;    //returns the display
       }
        
       public static void main(String[] args) 
       {
           
           System.out.println(Exception18.display("hiii", "welcome to"));   //prints the play 
           System.out.println();
           System.out.println(Exception18.display(null, "cricket"));
       }
   }
       
   
   
    

