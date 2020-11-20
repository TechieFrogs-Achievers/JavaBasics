public class Pattern24 
{
    public static void main(String[] args)
    {
        
        System.out.println("** Printing the pattern... **");
        int input=10;
        

        for (int i = 1; i <= input.length(); i++) 
        { 
            for (int j = input.length(); j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k >= 1; k--)
            {
                System.out.print(input.charAt(i - 1));
            }
            System.out.println("");
        }
    }
}
