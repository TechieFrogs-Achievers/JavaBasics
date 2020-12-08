import java.util.Scanner;
 public class Array10 {
    static int arr[] = {256,325,897,4562,987}; 
     Scanner sc = new Scanner(System.in); 
   // Method to find minimum in arr[] 
    static int smallest() 
    { 
        int i; 
          
        // Initialize minimum element 
        int min = arr[0]; 
       
        // Traverse array elements from second and 
        // compare every element with current min   
        for (i = 1; i < arr.length; i++) 
            
              if(min>arr[i])
              min = arr[i];
             
       
        return min; 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        System.out.println("smallest in given array is " + smallest()); 
       } 
    
}
