public class Alaphabets
 {
    public static void main(String[] args)
    {
        char ch;
        //uppercase letters
        System.out.println("uppercase letters are:");
        for(ch= 'A'; ch <= 'Z'; ++ch)
        {
            System.out.print(ch + " "+"\n");  
        }
        //lower letters
        System.out.println("lowercase letters are:");
        for(ch= 'a'; ch <= 'z'; ++ch)
        {
            System.out.print(ch + " "+"\n"); 
        }
    }
}
