public class Pattern 
{
    public static void main(String[] args)
     {
       
        // Example1
        
        /*
       
        for(int i=1;i<=5;i++)
       {
           
         for(int k=5;k>=1;k--)
           {
               if(i==k)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(k);
               }
           }
       System.out.println();
    }

    */

    // Example4

        /*
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i*j+" ");
        
            }
            System.out.println( );
        }
        
        
        */
       
        //Example(ISTS)

       
       /*
       
        String ch = "ISTS";
    

        for(int i=0;i<=ch.length()-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch.charAt(j));
            }
            System.out.println();
        }

        */

        //pattern 1

        /*

        for(char i=65;i<=70;i++)
        {
            for(char j=65;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        */


        //pattern2

        /*
        
        for(char i=65;i<=70;i++)
        {
            for(char j=65;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        */

        //pattern3

        
        /*

        for(char i=70;i>=65;i--)
        {
            for(char j=65;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        for(char x=65;x<=70;x++)
            {
                for(char y=65;y<=x;y++)
                {
                    System.out.print(y);
                }
                System.out.println();
            }
        

            */
            
            //pattern4

            
            /*
           
            for(char i=65;i<=70;i++)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            for(char i=69;i>=65;i--)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }

            */

            //pattern5
            
           /* 
            for(char i=70;i>=65;i--)
            {
                for(char j=i;j>=65;j--)
                {
                    System.out.print(j+" ");
                   
                }
                System.out.println();
            }


            for(char i=65;i<=70;i++)
            {
                for(char j=i;j>=65;j--)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            
            */
            
            //pattern6

            
            /*

            for(char i=65;i<=70;i++)
            {
                for(char j=70;j>i;j--)
                {
                    System.out.print(" ");
                }
             
             for(char k=65;k<=i;k++)
             {
                 System.out.print(k+" ");
             }
             System.out.println();
            }

            
            */


            //pattern7
            
            /*
            for(char i=65;i<=70;i++)
            {
                for(char j=70;j>=i;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }

                
            */

            //pattern8
           /*
           
            for(char i=70;i>=65;i--)
            {
                for(char j=70;j>=i;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }

            
            */

            //pattern9
           
            /*

            for(char i=70;i>=65;i--)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

            */

            //pattern10

            /*
            char k='A';
            for(int i=1;i<=6;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k++);
                }
                System.out.println();
            }

            */



            //pattern11
            /*
            for(char i=65;i<=70;i++)
            {
                for(char j=i;j>=65;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }

            */



            //pattern12
            
            /*
            for(char i=65;i<=70;i++)
            {
                int num = i;
                for(char j=65;j<=i;j++)
                {
                    System.out.print((char)(num)+" ");
                    
                     num=num+5; 
                     
                }
                System.out.println();
            }

            */

            //pattern14

            
            /*
            for(char i=65;i<=70;i++)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j);
                }
                
                
                for(int j=(i-1);j>=65;j--)
                {
                 System.out.print((char)j);
                }
            
                System.out.println();
            }

            
            */

            //pattern15

            /*
           
            for(char i=70;i>=65;i--)
            {
                for(int k=70;k>=i;k--)
                {
                    System.out.print(" ");
                }
                
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

            */



            //pattern16

            
            /*
            for(char i=65;i<=70;i++)
            {
                for(char j=70;j>i;j--)
                {
                    System.out.print(" ");
                }
             
             for(char k=65;k<=i;k++)
             {
                 System.out.print(k+" ");
             }
             System.out.println();
            }
            
            for(char i=69;i>=65;i--)
            {
                for(char k=69;k>=i;k--)
                {
                    System.out.print(" ");
                }
                
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

            */


            //pattern17

            /*
            
            for(char i=65;i<=70;i++)
            {
                for(char k=65;k<=i;k++)
                {
                    System.out.print(" ");
                }
                for(char j=i;j<=70;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            
            for(char i=70;i>=65;i--)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(char k=i;k<=70;k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }

            */



            //pattern18

            
            /*
            for(char i=65;i<=70;i++)
            {
                for(char k=65;k<=i;k++)
                {
                    System.out.print(" ");
                }
                for(char j=i;j<=70;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            
            for(char i=70;i>=65;i--)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(char k=i;k<=70;k++)
                {
                    System.out.print(k+" ");
                }
                System.out.println();
            }

            */


            //pattern19

            /*

            for(char i=70;i>=65;i--)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(char k=i;k<=70;k++)
                {
                    System.out.print(k+" ");
                }
                System.out.println();
            }

            */


            //pattern20

            
            /*
            for(char i=65;i<=70;i++)
            {
                
                for(char k=70;k>i;k--)
                {
                    System.out.print("  ");
                }
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                 for(int j=(i-1);j>=65;j--)
                {
                 System.out.print((char)j+" ");
                }
            
                System.out.println();
            }
            
            */


            //pattern21


            /*

            for(char i=65;i<=70;i++)
            {
                for(char j=70;j>i;j--)
                {
                    System.out.print('A');
                }
                for(char j=65;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }

            */


            //pattern22

            /*
            
            for(char i=65;i<=70;i++)
            {
                for(char j=i;j<=70;j++)
                {
                    System.out.print(j);
                }
                for(char j=69;j>=i;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }

            
            */


            //pattern23

            /*

            for(char i=65;i<=70;i++)
            {
                for(char k=70;k>=i;k--)
                {
                    System.out.print(" ");
                }
                 for(char j=65;j<=i;j++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }

            */


            //pattern27

            /*

            int k = 65;
            for(int i=0; i<=5;i++)
            {
                for(int j=0; j<=5; j++)
                {
                    System.out.print((char)(k+i+j));
                }
                System.out.println();
            }
            
            */
            
            
            //pattern28

            /*
            
            for(char i=69;i>=65;i--)
            {
                for(char j=65;j<=i;j++)
                {
                    System.out.print(j);
                }
                
            for(int j=(i-1);j>=65;j--)
                {
                    System.out.print((char)j);
                   
                }
                System.out.println();
            }
       
            */

            
            
            //pattern37

           /*

            for(char i=69;i>=65;i--)
            {
                for(char j=69;j>=i;j--)
                {
                    System.out.print(j);
                }
                for(char j=65;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }

            */



            //pattern36
           
           /*
           
            int a = 65;
           
            for(int i=0;i<5;i++)
           {
               for(int j=0;j<5;j++)
               {
                if (j % 2 == 0)
                System.out.print((char) (a+(5*(j))+i)+ " ");
                else
                System.out.print((char) (a+(5*(j + 1))-1-i) + " ");
        
               }
               System.out.println();
           }

           */


           //Example3

           /*
           for(int i=1; i<=4; i++)
           {
               for(int j=1; j<=9; j++)
               {
                   if(i==j||j==5||i+j==10)
                   {
                       System.out.print("*");
                   }
                   else{
                       System.out.print("0");
                   }
               }
               System.out.println();
           }

           */

           //Example5

           /*

           for(int i=1; i<=4; i++)
            {
            for(int j=1; j<=7; j++)
            {
                if(i==j || i+j==8)
                {
                System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
             }
        for(int i=3; i>=1; i--)
                {
                for(int j=1; j<=7; j++)
                {
              if(i==j || i+j==8)
              {
              System.out.print(i);
              }
              else
              {
                System.out.print(" ");
              }
            }
            System.out.println();
        }

        */


        //Example9

        for ( int i=1; i <= 10 ; i++ )
        {
            for ( int j = 1 ; j <= 10 ; j++ )
            {
                if ( j == 1 || i == 1 || i == 10 || j==10)
                {
                    System.out.print("1");
                }
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    


       
        




        














    }










   } 

