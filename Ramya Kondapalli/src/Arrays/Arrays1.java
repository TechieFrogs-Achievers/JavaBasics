package Arrays;

//finding minimum num in array
public class Arrays1 {

    static void display(int[] arr){  //method to find minimum num in array

        int min = arr[0];

     for(int i=1;i<arr.length;i++){

         if (min>arr[i]){
            min = arr[i];
            System.out.println(min);
        }
    }
}
    public static void main(String[] args){

    int[] arr = {22,76,65,43,12};  //array decalration 
    
    display(arr);  //method calling by passing array
}
}
