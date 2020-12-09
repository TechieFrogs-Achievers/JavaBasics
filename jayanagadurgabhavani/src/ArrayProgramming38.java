public class ArrayProgramming38 
{
    public static void main(String[] args) 
    {
            int[] array = { 5,6,3,5,7,8,9,9 };
            int length = array.length;
            int sum = 0;
            for (int i = 0; i < array.length; i++)// sum of all values in array using for loop
             {
                sum += array[i];
            }
    
            double average = sum / length;
            
            System.out.println("Average of array : "+average);
    }
}
