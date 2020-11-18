public class WhileExercise
 {
    public static void main(String args[]) 
    { 
        int x = 1; 
        int sum = 0;
        int num = 1234;
         int rev = 0;  

         //sum of numbers
        while (x <= 10) 
        { 
            sum = sum + x; 
            x++; 
        } 
        System.out.println(" total  " + sum); 

        //rev of a num
        
        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num =num/ 10;
        }
        System.out.println("Reversed Number: " + rev);
    } 
    
}
