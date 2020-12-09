package Arrays;
//program to assaign/copy one arrayto another
public class ArrayExcersice1 {
    public static void main(String[] h){
        //declaring,instantiating and initialization of an array
        int b[]=new int[]{2,3,4,5,6,};
        int[] a;//declaring new array
        a=b;//assigning one array to another

        // printing the array elemnts using foreach loops
        for(int d:b){
            System.out.println("array b[] "+d);
        }
        for(int c:a){
        System.out.println("array a[] "+c);
    }
}
    
}
