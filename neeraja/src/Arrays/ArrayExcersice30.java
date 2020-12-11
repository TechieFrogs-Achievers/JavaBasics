package Arrays;

public class ArrayExcersice30 {
    public static void main(String[] o){
        //declaring and initializing an array
        int[] []a={{9,8,7},{6,5,4},{3,2,1}};
        int even=0;
        int odd=0;
        
        //traversing each and every element in an array
        for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
                if((a[i][h])%2==0){//condition to check element is even or odd
                    even++;        //if even increse count
                }
                else if((a[i][h]%2)!=0){//condition to check odd element
                    odd++;         //if odd increase count
                }

            }
        }
        //displays frwquency of odd and even numbers in array
        System.out.println("frequency of even no's "+even);
        System.out.println("frequency of odd no's "+odd);
    
    }
}
