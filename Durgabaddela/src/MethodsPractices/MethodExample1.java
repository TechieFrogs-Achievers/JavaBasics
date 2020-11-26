package MethodsPractices;

public class MethodExample1 
{
    int number;
    char letter;

    //method to print integer and character

    public void PrintData(int n, char ch)
    {
       number = n;
       letter = ch;
       System.out.println("integer  = "+number);
       System.out.println("charcter = "+letter);
    }
    //method to print character and integer

    public void PrintData(char ch, int n)
    {
       number = n;
       letter = ch;
       System.out.println("character= "+letter);
       System.out.println("integer  = "+letter);
    }
    public static void main(String[] args) 
    {
        MethodExample1 m = new MethodExample1();// creating object for a class

        //calling methods with object

        m.PrintData(123,'d');
        m.PrintData('A', 432);
    }



}
