package Arrays;

public class ArrayExcersice03 {
    public static void main(String l[]){
        int arr[]={1,2,3,4,5};
        int n=5;
       /* int j;
        for(int i=0; i<n;i++){
            int temp=arr[0];
            //arr[i]=arr[j+1];
            for(j=0;j<arr.length-1;j++){
               arr[j]=arr[j+1];
            }
            arr[j]=temp;
        }
        
            //System.out.println("after rotation");
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }*/  
            for(int i = 0; i < n; i++){  
                int j, temp;  
                //Stores the first element of the array  
                temp = arr[0];  
                for(j = 0; j < arr.length-1; j++){  
                    //Shift element of array by one  
                    arr[j] = arr[j+1];  
                }  
                //First element of array will be added to the end  
                arr[j] = temp;  
            }  
            System.out.println();  
            //Displays resulting array after rotation  
            System.out.println("Array after left rotation: ");  
            for(int i = 0; i< arr.length; i++){  
                System.out.print(arr[i] + " ");  
            }  
        
        }
}
