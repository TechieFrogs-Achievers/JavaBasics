package codingassessment;

import java.util.Scanner;

public class Three {
    public static void main(String[] j){
        Scanner sc=new Scanner(System.in);
        int starting_Index=sc.nextInt();
        int ending_Index=sc.nextInt();
        int sum=0;
        for(int i=1; i<=ending_Index-starting_Index; i++){
    
            if((starting_Index%i==0)){
                sum=sum+i;
            }
        }
    }
    
}
