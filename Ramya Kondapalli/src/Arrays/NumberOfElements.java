package Arrays;

public class NumberOfElements {
    public static void main(String[] args) {

        int[] arr = new int[] {1,7,22,54,76,97,33,5,7,33,2,5,6,702,24};

        int count =0;  //variable for counting 

        //loop for counting number of elements
        for (int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println("number of elements : " + count); //print count value
    }
}
