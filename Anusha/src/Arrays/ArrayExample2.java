package Arrays;
import java.util.*;
public class ArrayExample2
{
    public static void main(String[] args) 
    {
        System.out.println("enter size of array:");
        Scanner sc = new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] ch= new int[length];
        int[] freq = new int[length];
        int visited=-1;
        int count;
        System.out.println("enter  elements:");
        for(int i=0;i<ch.length;i++) //reading the input
        {
            ch[i]=sc.nextInt();
        }
        for(int i=0;i<ch.length;i++)
        {
             count=1; //count starts with 1
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j]) //checking the condition
                {
                    count++;// count increament
                freq[j]=visited;
                }
            }
            if(freq[i]!=visited)
            {
                freq[i]=count;
            }

        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=visited)
            {
                System.out.println(ch[i]+" "+freq[i]+" ");  //prints the frequency of characters

            }
        }        sc.close();

  
    }
}
