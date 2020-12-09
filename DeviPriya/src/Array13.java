public class Array13 {
    void rightRotate(int arr[], int d, int n) 
    { 
        // create temp array of size d 
        int temp[] = new int[n - d]; 
  
        // copy first N-D element in array temp 
        for (int i = 0; i < n - d; i++) 
            temp[i] = arr[i]; 
  
        // move the rest element to index 
        // zero to D 
        for (int i = n - d; i < n; i++) { 
            arr[i - d - 1] = arr[i]; 
        } 
  
        // copy the temp array element 
        // in origninal array 
        for (int i = 0; i < n - d; i++) { 
            arr[i + d] = temp[i]; 
        } 
    } 
  
    // utility function to print an array 
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        Array13 rotate = new Array13(); 
        int arr[] = { 1, 2, 3, 4, 5 }; 
        rotate.rightRotate(arr, 2, arr.length); 
        rotate.printArray(arr, arr.length); 
    } 
    
}
