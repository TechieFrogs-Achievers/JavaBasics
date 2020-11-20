public class Programmingpatterns2 
{
    public static void main(String[] args)
     {  
        int k=15;  
        int i,j;  
        int s=0;  
        for(i=0;i<k;i++){// this loop is used to print lines  
            for(j=1;j<=s;j++){// this loop is used to print space in a line  
                System.out.print(" ");  
            }  
            for(j=1;j<=k;j++){// this loop is used to print numbers in a line  
                if(j<=(k-i))  
                System.out.print(j);  
                else  
                System.out.print("*");  
            }  
            j--;  
            while(j>0){// this loop is used to print numbers in a line  
                if(j>k-i)  
                System.out.print("*");  
                else  
                System.out.print(j);  
                j--;  
            }  
            if((k-i)>9)// this loop is used to increment space  
            s=s+1;  
        System.out.println("");  
        }  
    }
}
