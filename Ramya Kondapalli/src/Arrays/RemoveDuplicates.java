package Arrays;

//Remove Duplicate Element in an array

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        //declaration array
        int[] arr = new int[] {1,2,4,1,4,3,4,8,3};

        for (int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                //if two elemnts are equal then replace that element with 0
                if(arr[i] == arr[j]){
                    arr[i] =0;
                }
            }
        }

        //displaying array after removing duplicates
        for (int i=0;i<arr.length;i++){
 
            //if element equal to 0 then skip that elemnt with  continue statement
            if (arr[i] == 0){
                continue;
            }
            else
                System.out.println(arr[i]);
        }
           
    }
}
