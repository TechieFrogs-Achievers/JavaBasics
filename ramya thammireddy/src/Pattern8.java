public class Pattern8 
{
     
        public static void main(String []args)
        {  
            int lines=10;  
            int i,j;  
             int count;  
            for(i=1;i<=lines;i++)
            {  
                 count=0;  
                for(j=1;j<lines;j++)
                {  
                    if(count<i-1){  
                    if(!(j<lines-i+1))
                    {  
                       System.out.print(j);  
                       count++;  
                   }  
               }  
           }  
           System.out.print("0");  
           count=0;  
           for(--j;j>=1;j--)
           {  
               if(count<i-1)
               {  
               System.out.print(j);  
               count++;  
               }  
           }  
           System.out.println("");  
      }  
        }  
    
    
}
