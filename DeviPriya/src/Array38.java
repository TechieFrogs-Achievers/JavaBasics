public class Array38 {
    public static void main(String[] args) {
        int[] arr = {19, 12, 16, 200, 13};
        int total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }


        /* arr.length returns the number of elements 
         * present in the array
         */
        double average = total / arr.length;
        
        System.out.println(average);//new line   
    }
    
}
