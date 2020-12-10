public class ArrayProgramming17
 {
    public static void main(String[] args) 
    {    
        int arr[]={1, 2, 3, 4, 5};     
        int n = 3;      
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) //display by the orginal array
        {     
            System.out.print(arr[i] );    
        }        
        for(int i = 0; i < n; i++)//Rotate the given array by n times toward right
        {    
            int j, last;       
            last = arr[arr.length-1];    
            for(j = arr.length-1; j > 0; j--)
            {    
              arr[j] = arr[j-1];    
            }        
            arr[0] = last;    
        }    
        
        System.out.println();       
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++)//Displays resulting array after rotation 
        {    
            System.out.print(arr[i]);    
        }    
    }    
}
