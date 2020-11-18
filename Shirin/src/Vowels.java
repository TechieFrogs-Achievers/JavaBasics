public class Vowels
{
    public static void main(String[] args) 
    {
        // using if
      char c = 's';
      if ( c== 'a' || c == 'e' || c == 'i' || c == '0' || c == 'u')
      {
          System.out.println(" the given alphabet is vowel= " +c);
      }
      else 
      {
          System.out.println(" the give alphabet is consonant = " +c);
      }



      // using switch 
       char  letter = 'i';
       switch (letter)
       {
           case 'a' :;
           case 'e' :;
           case 'i' :;
           case 'o' :;
           case 'u' :;
           System.out.println(" the letter is vowel ");
           break;

           default:
           System.out.println(" the letter is consonant ");
                   

           
       }
        
    }
    
}
