package Arrays;
//program to assaign/copy one arrayto another
public class ArrayExcersice1 {
    public static void main(String[] h){
        //declaring,instantiating and initialization of an array
        int b[]=new int[]{2,3,4,5,6,};
        int[] a;//declaring new array
        a=b;//assigning one array to another


        // printing the array elemnts using foreach loops
        System.out.print("array b[] is");
        for(int d:b){
            System.out.print(d+" ");
        }
        System.out.println();

        System.out.println("array a[] is");
        for(int c:a){
        System.out.print(c+" ");
    }
        System.out.println();


    //using while loop
    int i=0;
    do{
        System.out.print(a[i]+" ");
        i++;
    } while(i<=a.length-1);
}
    
}
