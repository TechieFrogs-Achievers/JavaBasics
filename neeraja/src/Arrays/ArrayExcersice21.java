package Arrays;

import java.util.Scanner;
//program to eliminate duplicate elements
public class ArrayExcersice21 {
    public static void main(String o[]){
     Scanner sc=new Scanner(System.in);
        int e[];
        e=new int[7];
        
        System.out.println("enter array  elemets");
        //initializing array
        for(int i=0; i<e.length; i++){
            e[i]=sc.nextInt();
        }
        sc.close();
        //array before elimination
        System.out.print("before elimination of array");
        for(int l=0; l<e.length; l++){
            System.out.print(e[l]+" ");
        }
        //eliminating duplicates 
        for(int i=0; i<e.length; i++){
            for(int j=i+1; j<e.length; j++){
                if(e[i]==e[j]){
                    //q[k]=e[i];
                    e[j]=0;
                }
            }
        }
        System.out.print("after elimination of array");
        //display array after removing duplicates
        for(int i=0; i<e.length;i++){
            if(e[i]==0){
                continue;
            }
            else{
                System.out.print(e[i]+" ");
            }
        }
    }
    
}
