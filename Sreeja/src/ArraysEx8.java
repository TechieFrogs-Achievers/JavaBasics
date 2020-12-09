public class ArraysEx8
 {
     public static void main(String[] args) 
     {
        int arr[] = {1,2,3,4,5,6,7,8};

        System.out.println("Odd position elements are:");
        
        //loop to print elements
        
        for(int i=0;i<arr.length;i=i+2)     //to print odd positions (i=i+2)        
        {
            
            System.out.print(" "+arr[i]);
            
        }

        
    }
}
