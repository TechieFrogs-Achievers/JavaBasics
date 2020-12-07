package StringExamples;

public class Program16 
{
    public static void main(String[] args) {
        
    String s = " iam good girl";

        for (int i =0;i<=s.length()-1;i++)//for loop to get the characters in each  string
        {
            
            char ch = s.charAt(i);//for getting character at i value 
    
            if (Character.isLetter(s.charAt(i)))
            {
                
                ch = Character.toUpperCase(ch);
                System.out.print(ch);//converting each letter to lowercase
            }
            else
            {
                System.out.print(" ");
            }
        }
    
    }
}
