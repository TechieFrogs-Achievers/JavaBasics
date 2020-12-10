public class ArraysEx15
 {
    public static void main(String[] args)
     {
        int arr[] = {54,5685,1,48,56};

        int temp;

        //loop to sort the elements in descending order

        for(int i=0;i<arr.length;i++)             
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])           //condition to check the largest number
                {
                    temp=arr[i];            //if it is true swaping of two numbers
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }

        for(int i=0;i<arr.length;i++)           //loop to print the elements
        {
            System.out.print(" "+arr[i]);
        }
        
    }
}
