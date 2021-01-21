package Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {6,7,8,9,0};

        //finding total length 
        int len = arr1.length + arr2.length;

        //declaring new array with total length
        int[] newArr = new int[len];

        //variavble for increasing the position in for-each loop
        int pos =0;

        //copying arr1 into new array using for-each loop
        for (int i :arr1){
            newArr[pos] = i;
            pos++; 
        }

        //copying arr1 into new array using for-each loop
        for(int i: arr2){
            newArr[pos] = i;
            pos++;
        }

        //displaying new array after concatination
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");  //1 2 3 4 5 6 7 8 9 0 
        }
    }
}
