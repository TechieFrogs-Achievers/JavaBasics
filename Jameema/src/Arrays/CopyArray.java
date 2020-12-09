package Arrays;

import java.util.Scanner;

public class CopyArray 
{
    public static void main(String[] args) 
    {
        //dynamic values copying
        Scanner sc = new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        char[] ch = new char[length];
        char[] ch1 = new char[length]; //char input
        for(int i =0 ; i<ch.length;i++)
        {
            ch[i]= sc.next().toCharArray()[0]; 
        }
        ch1=ch; //coping the data
        for(int j=0;j<ch1.length;j++)
        {
            System.out.println(ch1[j]); //print the result
        }

        System.out.println();

        //static values coping

        char old[] ={ 'j','e','m','i'} ; //data members
        char latest[] = new char[8]; //empty array
        System.arraycopy(old, 1, latest,0,3); //copying data from one array to another array
        System.out.println(latest);
        sc.close();

        
    }
    
}
