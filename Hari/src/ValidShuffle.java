public class ValidShuffle 
{
    static boolean shuffleCheck(String one ,String two , String output )
    {
        if(one.length()  + two.length() != output.length()) //input length of two strings is equal to resultant length of shuffled string
        {
            return false ;
        }
        int i = 0 , j = 0 , k = 0 ;
        while(k != output.length()) //iterating through output characters
        {
            if(i < one.length() && one.charAt(i) == output.charAt(k))
            i++ ;
            else if( j < two.length() && two.charAt(j) == output.charAt(k))
            j++ ;
            else {
            return false ;
            }
            k++ ;
        }   
        if(i < one.length() || j < two.length())
        {
           return false ;
        }
        return true;
    }
public static void main(String[] args)
{
    String one = "MN";
    String two = "AB" ;
    String[] outputs = { "ANMB" , "MABN"} ;
    for(String output : outputs)
    {
        if(shuffleCheck(one,two,output) == true)
        {
            System.out.println(output + " is a valid shuffle");
        }
        else 
        {
            System.out.println(output + " is not a valid shuffle ");
        }
    }
}
}
