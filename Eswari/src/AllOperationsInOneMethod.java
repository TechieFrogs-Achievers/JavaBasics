
public class AllOperationsInOneMethod {

    int c;
    public void operations(int a, int b, String op)
    {
        if(op == "+")
        {
            c= a + b;
            System.out.println(c);
        }
        else if(op == "-")
        {
            c=a -b;
            System.out.println(c);
        }
        else if(op == "*")
        {
            c= a * b;
            System.out.println(c);
        }
        else if(op == "/")
        {
            c= a / b;
            System.out.println(c);
        }
        else if(op == "%")
        {
            c= a % b;
            System.out.println(c);
        }
        else
        {
            System.out.println("you have to give correct operator");
        }
        

    }
    public static void main(String[] args) {
        AllOperationsInOneMethod ao= new AllOperationsInOneMethod();
        ao.operations(20, 5,  "?");
    }
    
}
