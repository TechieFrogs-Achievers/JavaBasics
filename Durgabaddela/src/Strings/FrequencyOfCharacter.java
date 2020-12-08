package Strings;

import java.util.Scanner;

public class FrequencyOfCharacter 
{
    public static void main(String[] args) 
    {
    Scanner scan=new Scanner(System.in);
    String str=scan.nextLine();
    int count=0;

    for(int i=0;i<=str.length()-1;i++)
    {
        if(str.charAt(i)=='e')
        {
            count++;
        }
    }
    System.out.println("the charecter e present"  +count+ "times");
    scan.close();
}
}
