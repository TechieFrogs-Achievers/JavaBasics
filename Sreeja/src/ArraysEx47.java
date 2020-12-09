public class ArraysEx47 
{
     public static void main(String[] args) 
     {
        char ch[] = {'a','b','c','d'};          //initializing the character array
        
        String str = new String(ch);            //characters are combined into string

        System.out.println("String is"+" "+str);

        char ch1[] = str.toCharArray();         //coverting string to characters

        System.out.println("Characters are");

        for(int i = 0 ; i < ch1.length ; i++)           //loop to print the characters
        {
            System.out.print(" "+ch1[i]);
        }
    }
}
