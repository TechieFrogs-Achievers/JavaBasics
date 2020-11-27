//package Methods;

//super class 
class Method
{
    int i;
    //method for printing i value
    public void printNum(int i)
    {
        System.out.println("The valu of i is " +i);
    }
}

//sub class
class Method1 extends Method
{
    int j;
    //method for printing i value
    public void printNum(int j)
    {
        System.out.println("The value of j is " +j);
    }
}
    

public class MethodExample6 
{
    public static void main(String[] args) {
        Method1 m1 = new Method1();                     //object creation for sub class
        m1.printNum(5);
        //m1.printNum(6);
    }
    
}
