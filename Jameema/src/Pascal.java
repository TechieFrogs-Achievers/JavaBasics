public class Pascal
 {
     public static void main(String[] args)
      {
          int n=5 , num=1, i ,j ;
          int space=n;
          for(i=0;i<n;i++)
          {
              for(j=1;j<space;j++)
              {
                  System.out.print(" ");
              }
              num=1;
              for(int k=0;k<=i;k++)
              {
                 System.out.print(num + " ");
                   num = num * (i-k)/(k+1);

              }
              space--;
              System.out.println();
          }
         
         
     }
    
}
