public class AlphabetOrNot
{
    public static void main(String[] args)
    {
      char ch='A';
      //check the given character is alphabet or not
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
      {
          System.out.println("given character is alphabet is:"+ch);
      }  
      else 
      {
        System.out.println("not a alphabet");  
      }
    }
}
