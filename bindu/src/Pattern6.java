public class Pattern6 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<=5;i++)
        {
        for(j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(k=0;k<=i;k++)
        {
            System.out.print ((char)(65+k) +" ");
        }
        System.out.println();
        }
        System.out.println("pattern7 is:");

        //pattern7

        for(i=0;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print((char)(65+j) +" ");
            }
            System.out.println(" ");
        }
        System.out.println("pattern8 is:");

        //pattern8

        for(i=5;i>=0;i--)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print((char)(65+j));
            }
            System.out.println(" ");
        }
        System.out.println("pattern9 is:");

        //pattern9
      for(i=5;i>=0;i--)
      {
          for(j=0;j<=i;j++)
          {
              System.out.print((char)(65+j) +" ");
          }
          System.out.println();
      }

      System.out.println("pattern10 is:");
      //pattern10
      char A=65;
      for(i=0;i<=5;i++)
      {
          for(j=0;j<=i;j++)
          {
              System.out.print((char)A +" ");
              A++;
          }
          System.out.println();
      }
      System.out.println("pattern15 is:");
      // pattern15

      for(i=5;i>=0;i--)
        {
        for(j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(k=0;k<=i;k++)
        {
            System.out.print ((char)(65+k) +" ");
        }
        System.out.println();
      }
      System.out.println("pattern12 is:");
      //pattern12
      
      for(i=0;i<=5;i++)
      {
          int alpha=i;
          for(j=i;j>=0;j--)
          {
              System.out.print((char)(65+alpha));
              alpha=alpha+5;
          }
          System.out.println();
      }
      System.out.println("pattern16 is:");
      for(i=5;i>=0;i--)
      {
      for(j=5;j>=i;j--)
      {
          System.out.print(" ");
      }
      for(k=0;k<=i;k++)
      {
          System.out.print ((char)(65+k) +" ");
      }
      System.out.println();
    } for(i=5;i>=0;i--)
    {
    for(j=5;j>=i;j--)
    {
        System.out.print(" ");
    }
    for(k=0;k<=i;k++)
    {
        System.out.print((char)(65+k) +" ");
    }
    System.out.println();
    } 
    for(i=5;i>=0;i--)
        {
        for(j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(k=0;k<=i;k++)
        {
            System.out.print((char)(65+k) +" ");
        }
        System.out.println();
      }
      for(i=0;i<=5-1;i++)
        {
        for(j=5;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(k=0;k<=i;k++)
        {
            System.out.print ((char)(65+k) +" ");
        }
        System.out.println(" ");
        }  
        System.out.println("pattern18 is:");
        for(i=0;i<=5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print((char)(65+k) +" ");
            }
            System.out.println();
            
        }
        for(i=5;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print((char)(65+k) +" ");
            }
            System.out.println();
        }
        
        System.out.println("pattern17 is:");
        // pattern17

        for(i=0;i<=5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print((char)(65+k));
            }
            System.out.println();
            
        }
        for(i=5;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print((char)(65+k));
            }
            System.out.println();
        }  
        System.out.println("program9 is:");
        int n=10;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
             if((j==1||j==n)||(i==1||i==n))
            {
                System.out.print("1");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

        System.out.println("program1 is:");

    //program1

    int m=5;
    for(i=1;i<=m;i++)
    {
        for(j=m;j>=1;j--)
        {
            if(j!=i)
            {
                System.out.print(j);
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    System.out.println("program4 is:");

    int lines=10;
    for(i=1;i<=lines;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(i*j +" ");
        }
        System.out.println("");
    }
    System.out.println("program3 is:");

    int f=4;
    for(i=1;i<=f;i++)
    {
        for(j=1;j<=f;j++)
        {
            if(i==j)
            {
                System.out.print("*");
            }
            else{
                System.out.print("0");
            }
        }
        j--;
        System.out.print("*");
        while(j>=1)
        {
            if(i==j)
            {
                System.out.print("*");
            }
            else{
                System.out.print("0");
            }
            j--;
        }
        System.out.println("");
    }
    System.out.println("program16 is :");
    //program16
    String str ="ISTS";
    char a[]=str.toCharArray();
    for(i=0;i<=a.length-1;i++)
    {
        for(j=0;j<=i;j++)
        {
            System.out.print(a[j]);
        }
        System.out.println();
    }
    System.out.println("pattern10 is:");

    int d =6,num=1,e,h;
        int value =d;
        for(e=0;e<d;e++)
        {
            for(h=1;h<value;h++)
            {
                System.out.print(" ");
            }
            num=1;
            for(int p=0;p<=e;p++)
            {
                System.out.print(num +" ");
                num = num*(e-p)/(p+1);
            }
            value--;
            System.out.println();

        }
        System.out.println("pattern21 is:");

        for(i=0;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print('A'+" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
        System.out.println("pattern22 is:");

        for(i=0;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            for(k=5-1;k>=i;k--)
            {
                System.out.print((char)(65+k) +" ");
            }
            System.out.println();
        }

        System.out.println("pattern27 is:");

        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print((char)(65+i+j));
            }
            System.out.println();
        }
        System.out.println("pattern28 is:");

        for(i=0;i<=5;i++)
        {
            for(j=0;j<5-i;j++)
            {
                System.out.print((char)(65+j) +" ");
            }
            for(k=5-i-2;k>=0;k--)
            {
                System.out.print((char)(65+k) +" ");
            }
            System.out.println();
        }
        System.out.println("pattern25 is:");

        int count=1;
        int row=1,alphabet =65;
        for(i=1;i<=5;i++)
        {
            if(i%2==0)
            {
                int rev =row+count-1;
                for(j=0;j<i;j++)
                {
                    System.out.print((char)(rev+alphabet-1) +" ");
                    rev--;
                    count++;
                }
            }
            else{
                for(j=1;j<=i;j++)
                {
                    System.out.print((char)(count+alphabet-1) +" ");
                    count++;
                }
            }
            System.out.println();
            row++;
        }
        System.out.println("program15 is :");
        int s=6;
        int left=1,right=1,diagonal=2;
        for(i=0;i<n;i++)
        {
            System.out.print(left++);
            for(j=0;j<2*i;j++)
                System.out.print(" ");
                if(i!=0 && j!=n-1)
                    System.out.print(diagonal++);
                else
                    System.out.print(" ");
                
                for(j=0;j<2*(n-i-1);j++)
                    System.out.print(" ");
                    System.out.println(right++);
                    System.out.println();      
        } 
        System.out.println("program8 is:");

        int count2;
        for(i=1;i<=n;i++)
        {
            count2=0;
            for(j=1;j<n;j++)
            {
                if(count2<i-1)
                {
                    if(!(j<n-i+1))
                    {
                        System.out.print(j);
                        count2++;
                    }
                }
            }
            System.out.print("0");
            count2=0;
            for(--j;j>=1;j--)
            {
                if(count2<i-1)
                {
                    System.out.print(j);
                    count2++;
                }
            }
            System.out.println(" ");
        }
        System.out.println("pattern24 is:");

        String input ="JAVA";
        for(i=1;i<=input.length();i++)
        {
            for(j=input.length();j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=i*2-1;k>=1;k--)
            {
                System.out.print(input.charAt(i-1));
            }
            System.out.println("");
        }
        System.out.println("program7 is:");

        int space =0;
        int r=4;
        for(i=0;i<r;i++)
        {
            for(j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=r;j++)
            {
                if(j<=(r-i))
                    System.out.print(j);
                    else
                        System.out.print("*");
            }
                    j--;
                    while(j>0)
                    {
                        if(j>r-i)
                        System.out.print("*");
                        else
                        System.out.print(j);
                        j--;
                    }
                    if((r-i)>9)
                    space=space+1;
                    System.out.println("");
                }
                System.out.println("program13 is:");
                int t=97;
                int z=5;
                for(i=1;i<=z;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(i);
                    }
                    for(j=z;j>=i;j--)
                    {
                        System.out.print((char)t);
                    }
                t++;
                System.out.println();
                }
        }
    }











