public class LargestNumber
 {
     public static void main(String[] args)
      {
        
        int firstValue = 7;
        int secondValue = 77;
        int thirdValue = 777;

        if(firstValue>secondValue&&firstValue>thirdValue)
        {
            System.out.println("Largest number is  "+ firstValue);
        }
        else if(secondValue>thirdValue)
        {
            System.out.println("Largest number is  "+ secondValue);
        }
        else 
        {
            System.out.println("Largest number is  "+ thirdValue);
        }

    }
}
