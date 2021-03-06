package wiproExcersices;
import java.util.Scanner;

class Require{
    
    public void range(int[] numbers, int leftRange, int rightRange,int size) {
    
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<leftRange || numbers[i]>rightRange){
                 System.out.println(numbers[i] + " ");
            }
        }
        
    }

}

public class Range {
    public static void main(String[] h){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of inputs:");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
             numbers[i]=sc.nextInt();
        }
        int leftRange=sc.nextInt();
        int rightRange=sc.nextInt();
         sc.close();
        Require r=new Require();
      r.range(numbers,leftRange,rightRange,n);
     }
    
}
