package StringExamples;
import java.util.Arrays;

public class Permutations 
{ 
    public static void main(String[] args) 
    {

        String s1="mohana";
        String s2="lakshmi";
        String s3="mohanalakshmi";
        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();
        int l=l1+l2;
        String s=s1+s2;


        if(l!=l3)//condition to check lengths are equal or not
        {
            System.out.println("No");
        }

        else
        {    
            //converting string to character array
             char[] c1=s.toCharArray();
             char[] c2=s3.toCharArray();
             //sorting chars 
             Arrays.sort(c1);
             Arrays.sort(c2);
             System.out.println(c1);
             System.out.println(c2);
           
             for(int i=0;i<l;i++) //loop to check both having same chars or not
             {
                if(c1[i]==c2[i]){

                }
             }
              System.out.println("valid string for shuffuling");
       }
    
    }
}
