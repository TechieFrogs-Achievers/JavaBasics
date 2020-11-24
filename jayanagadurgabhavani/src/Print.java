public class Print 
{
    int integer_value;
    char c;
    public void print(int integer_value, char c)
    {
       System.out.println(integer_value);
       System.out.println(c);
    }
    public void print(char c, int integer_value )
    
    {
        System.out.println('c');
        System.out.println(integer_value);
    }
public static void main(String[] args)
 {
     {
    Print pt=new Print();
    pt.print(566,'c');
    
     }
    {
      Print pt=new Print();
      pt.print('c',566);
    }

}
}




