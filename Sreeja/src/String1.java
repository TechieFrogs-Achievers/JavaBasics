import java.util.*;

public class String1 
{
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);        //create scanner object and read the value from user
    System.out.println("enter the sentence");

    int count = 0;
    int count1 = 0;    // initializing data members
    int count2 = 0;
    int count3 = 0;
    

    String str = sc.nextLine();         //read the string from user
    String sr = str.toUpperCase();      //converting all sentence to upper case
    for(int i=0;i<str.length();i++)     //for loop to check each character
    {
        char ch = sr.charAt(i);

        if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u')    //to check vowels
        {
          count++;  
        }
        else if(ch>='0'&&ch<='9')           //to check numbers
        {
            count1++;
        }
        else if(ch>='A'&&ch<='Z')           //to check consonants
        {
            count2++;
        }
        else if(ch==' ')                //to check spaces
        {
            count3++;
        }

       
    }
    
    //printing all the values

    System.out.println("No.of vowels: "+count);
    System.out.println("No.of digits:"+count1);
    System.out.println("No.of consonants:"+count2);
    System.out.println("No.of spaces:"+count3);

    sc.close();
  }  
}
