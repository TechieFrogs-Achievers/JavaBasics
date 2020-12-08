package Steam;

import java.util.Scanner;

public class Inputvalid 
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
   // int i=sc.nextInt();
    if (sc.hasNext())
    {
        int  i=sc.nextInt();
        System.out.println("checked the condition:"+sc.hasNext());
    }
    int j=sc.nextInt();
    while(j>20)
    {
        System.out.println("checked the loop:"+sc.hasNextInt());
    }
    
}
}
