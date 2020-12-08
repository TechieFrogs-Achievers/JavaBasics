package Arrays;
//program toprint even and odd elements in array
import java.util.Scanner;

public class ArrayExcersice22 {
    public static void main(String o[]){
        Scanner sc=new Scanner(System.in);
           int e[];
           e=new int[7];
           
           //initializing array
           for(int i=0; i<e.length; i++){
               e[i]=sc.nextInt();
           }
           //array before elimination
           System.out.print("given array");
           for(int l=0; l<e.length; l++){
               System.out.print(e[l]+" ");
           }
           //loop for printing even no's
           System.out.println("even no's are ");
          for(int l=0; l<e.length; l++){
         if((e[l]%2==0)){
             System.out.print(e[l]+" ");
         }
       }
       System.out.println();
         //loop for printing odd no's
         System.out.print("odd no's are ");
        for(int l=0; l<e.length; l++){
        if((e[l]%2!=0)){
            System.out.print(e[l]+" ");
        }
    }





}
}
