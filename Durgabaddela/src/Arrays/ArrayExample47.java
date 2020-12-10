import java.util.Arrays;

public class ArrayExample47 
{
    public static void main(String[] args)
     {
        char ch = 'c'; 
        String str = Character.toString(ch);//converting character to string
        
        System.out.println("The string is: " + str);


        //converting string to chars 
        String st = "durga lakshmi baddela ";
        
        char[] c = st.toCharArray(); //method to convert string to character 

        System.out.println("character array :"+ Arrays.toString(c));
    }
    
}
