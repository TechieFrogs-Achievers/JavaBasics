public class OperatorOverloading
{
    public void display(int a,int b) // method for int,int datatype for operator overloading +
    {
        System.out.println("Addition of two numbers:"+(a+b));

    }
    public void display(String s1,String s2) // method for string,string datatype for operator overloading + concatenation
    {
        System.out.println("String concatenation:"+(s1+s2));
    }
    void display(int a,String s)
    {
        System.out.println("String concatenation:"+" " +(a+s));
    }
    void display(char c,String s)
    {
        System.out.println("Char:"+(c+s));
    }
    public static void main(String[] args)
    {
        OperatorOverloading obj=new OperatorOverloading(); // obj creation 
        obj.display(56,32); // method for display for (int,int) 
        obj.display("Satya","Pachigolla"); // method for display for(String,String)
        obj.display(10,"satya"); // method call for String concatenation
        obj.display('c',"satya"); // char concatenating string
    }
}
