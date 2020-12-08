import java.util.Scanner;
 public class Array9 {
    static int arr[] = {256,325,897,4562,987}; 
     Scanner sc = new Scanner(System.in); 
   // Method to find maximum in arr[] 
    static int largest() 
    { 
        int i; 
          
        // Initialize maximum element 
        int max = arr[0]; 
       
        // Traverse array elements from second and 
        // compare every element with current min   
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
              
       
        return max; 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        System.out.println("Largest in given array is " + largest()); 
       } 
    
}
