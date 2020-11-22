package accessmodifiers;

public class Private 
{
    private int i;

    //private constructor
    Private Private(int t)
    {
        i=t;
        System.out.println("inside private constructor");
        System.out.println(i);   
    }

   /* //private method
    private void add(char firstnumber, int secondNumber)
    {
    int add=firstnumber+ secondNumber;
    System.out.println("inside private method");
    }   */

    {
     //init method
     i=10;
    System.out.println(i);   
    }
    
    public static void main(String[] args)
    {
        Private p=new Private(10);
       // p.add(10,20);
    }
}
