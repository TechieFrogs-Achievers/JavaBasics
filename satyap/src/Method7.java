class Number // parent class Number
{
    int i;
    void printNum(int i) //methods
    {
        System.out.println("i value:"+i);
    }
}
class Number1 extends Number //child class
{
    int j;
    void printNum(int j) // methods
    {
        System.out.println("j value:"+j);
    }
}
public class Method7 // main class
{
    public static void main(String[] args)
    {
    Number1 num=new Number1(); // obj creation for child class
    num.printNum(12); // method calling for child class method
    Number n=new Number(); // obj creation for parent class
    n.printNum(15); // method calling for parent class method
    }
} 
