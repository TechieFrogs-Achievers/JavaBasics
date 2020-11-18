public class Pyrmid
 {
     public static void main(String[] args)
      {
        int n=5;
        char m=70;

        // pyrmid using *
        for(int i=0;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*" + "  ");
           }
           System.out.println(" ");
        }   


    //pyrmid using num
        for(int i=0;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j);
           }
           System.out.println(" ");
        }   
         

     //pyrmid using alphabet
        for(char a=65;a<=m;a++)
        {
           for(char b=65;b<=a;b++)
           {
               System.out.print(a+ " ");
           }
           System.out.println(" ");
        }   
     }
    
}
