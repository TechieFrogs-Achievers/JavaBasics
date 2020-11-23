public class Alphabet 
{
    public static void main(String[] args) 
    {
        char j='('; //assiging special character to variable
        if ( (j>='a' && j<='z') || (j>='A' && j<='Z')) 
        {
            System.out.println("the character" +j+" is alphabet ");// printing the alphabets
        }
        else
        {
            System.out.println("the character "+j+" is not an alphabet  "); // printing the specialcharacters
        }
        
    }
    
}
