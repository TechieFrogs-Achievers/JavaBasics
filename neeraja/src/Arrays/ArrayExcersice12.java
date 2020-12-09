package Arrays;
//programto print sum of all elements in an array
public class ArrayExcersice12 {
    public static void main(String[] l){

        //declaring and initializing an array
        int []p={14,52,96,45,23,75};
        int sum=0;

       //traversing through array
        for(int i=0;i<p.length; i++){
         sum=sum+p[i];
        }
        
        //display sum of elements in array
        System.out.println(sum);
    }
    
    
}
