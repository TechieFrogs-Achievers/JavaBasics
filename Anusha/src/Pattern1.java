public class Pattern1 
{
   public void pattren1()
   {
      int i,j,lines=5;  
    for(i=1;i<=lines;i++)// this loop is used to print lines 
    { 
       for(j=lines;j>=1;j--)// this loop is used to print numbers in a line  
       {    
       if(j!=i)  
            System.out.print(j+" ");  
            else  
             System.out.print("* ");  
       }   
    System.out.println("\n");  
    }
   }
   //pattren3
   public void pattren3()
   {
      int rows=4,i,j;  
      for(  i=1;i<=rows;i++)
      { 
      for( j=1;j<=rows;j++)
      {  
          if(i==j)  
             System.out.print("*");  
            else  
           System.out.print("0");  
      }  
      j--;  
       System.out.print("*");  
      while(j>=1)
      {  
          if(i==j)  
           System.out.print("*");  
          else  
           System.out.print("0");  
          j--;  
      }  
    System.out.println("");  
  } 
   }
  //pattren 4
   public void pattren4()
   {
      int rows=10;  
      
      for(int i=1;i<=rows;i++)
      {  
          for(int j=1;j<=i;j++)
          {  
              System.out.print(i*j+" ");  
          }  
           System.out.println("");  
      }  
   }
  //pattren5
  public void pattren5()
  {
   int rows=8;  
   int i,j;  
   for(i=1;i<rows;i++)
   {// this loop is used to print the lines  
       for(j=1;j<=rows/2;j++)
       {// this loop is used to print numbers  
           if(i==j){  
               System.out.print(j);     
           }  
           else if(i>4 && j==rows-i)
           {  
               System.out.print(j);     
           }  
           else
           {  
              System.out.print(" ");   
           }  
       }  
       j=j-2;  
       while(j>0)
       { //this loop is used to print numbers  
           if(i==j)
           {  
           System.out.print(j);     
           }  
           else if(i>4 && j==rows-i)
           {  
               System.out.print(j);     
           }  
           else
           {  
               System.out.print(" ");   
           }  
            
           j--;  
       }  
       System.out.println("");  
   }
  }
  //pattren7
  public void pattren7()
  {
   int ch = 1,rows=5;
            
   for(int i=0;i<= rows;i++)
   {
       for(int j=0;j<=rows-i;j++)
       {
           System.out.print((ch+j));
       }
       for(int k=1;k<=i*2-1; k++)
       {
           System.out.print("*");
       }
       for(int l=rows-i; l>=0; l--)
       {
           if(l!=rows) 
               System.out.print((ch+l));
       }
      System.out.println();
   }
  }
  //pattren11
  public void pattren11()
  {
   int ch=65;
   for (int i = 1; i < 6; ++i) 
   {

     for (int j = 1; j < 7; ++j) 
     {
        if(i >= j)
           System.out.print(i);
         else 
         System.out.print(((char)(ch+i-1)));
     }
     System.out.println();
   }
  }
  //pattren15
  public void pattren15()
  {
   int i, j, counter = 0,height=7; 
   for (i = 1; i < height; i++) 
   { 
       System.out.print(i); 
       for (j = 1; j <= height; j++)  
       { 
           if (j == height) 
               System.out.print(i); 
           else if (j == counter) 
               System.out.print(j+1); 
           else
               System.out.printf(" "); 
       } 
       counter++; 
       System.out.printf("\n"); 
   } 
  }
  //pattren16
  public void pattren16()
  {
   int i,j,rows=4;
   for( i=1;i<=rows;i++)
   {
       
       for(j=1;j<=i;j++)
       {
           if(j==i)
             System.out.print('I'+" ");    
       }
       for(j=2;j<=rows;j++)
       {
           if(j==i)
             System.out.print('S'+" ");      
       }
       for(j=3;j<=rows;j++)
       {
           if(j==i)
             System.out.print('T'+" ");      
       }
       for(j=4;j<=rows;j++)
       {
           if(j==i)
             System.out.print('S'+" ");      
       }
       System.out.println();
   } 
  }

   public static void main(String[] args) 
   {
    Pattern1 p =new Pattern1();
    p.pattren1();
    p.pattren3();
    p.pattren4(); 
    p.pattren5();
    p.pattren7();  
    p.pattren11();
    p.pattren15();
    p.pattren16();
   } 
}
