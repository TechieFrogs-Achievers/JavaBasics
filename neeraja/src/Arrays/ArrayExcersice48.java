package Arrays;

import java.util.Scanner;

public class ArrayExcersice48 {
    public static void main(String[] args){
         //declaration of an aray
        float[] []a={{3.2f,1.2f,4.3f},{3.2f,1.2f,4.3f},{3.2f,1.2f,4.3f}};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  required element");
        float n=sc.nextFloat();//required element
        sc.close();
        int index;
        
        //traversing through the array to check required element
        for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
                if(a[i][h]!=n){//condition to check required element is matching or not
                   // System.out.println("Array  contain the value "+n);
                   continue;
                }
                else{
                   // index=i;
                 System.out.println("Array  contain the value "+n);
                }
                
            }
            break;
        }
        
            //System.out.println("Array  contain the value "+n);
        
        
    }
    
}
