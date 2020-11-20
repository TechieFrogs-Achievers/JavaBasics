public class Factorial {
    //using while loop 
    public static void main(String[] args) {
        int num = 3;
        int i = 1;
        long factorial = 1,fact =1; 
        while(i<=num)
        {
            factorial = factorial*i;
            i++;
            
        }
        System.out.println("factorial is:"  +factorial);


        //using  for loop
         for(int k = 1; k <= num; k++)
        {
            factorial = factorial*k;
        }
        System.out.println("Factorial is: " +factorial);
        
    }
    
}
