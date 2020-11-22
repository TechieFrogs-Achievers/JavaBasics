// class for calculating arithematic calculations in one class
public class AllOperationsInOneMethod {

    int c;
    public void operations(int a, int b, String op)
    {
        // if condition for checking whether the operator is + or not
        if(op == "+")
        {
            c= a + b;
            System.out.println(c);
        }
        // else if condition for checking whether the operator is - or not
        else if(op == "-")
        {
            c=a -b;
            System.out.println(c);
        }

        // else if condition for checking whether the operator is * or not
        else if(op == "*")
        {
            c= a * b;
            System.out.println(c);
        }

        // else if condition for checking whether the operator is / or not
        else if(op == "/")
        {
            c= a / b;
            System.out.println(c);
        }

        // else if condition for checking whether the operator is % or not
        else if(op == "%")
        {
            c= a % b;
            System.out.println(c);
        }
        // else condition for checking whether the operator is correct or not
        else
        {
            System.out.println("you have to give correct operator");
        }
        

    }
    public static void main(String[] args) {
        AllOperationsInOneMethod ao= new AllOperationsInOneMethod();  //creating object
        ao.operations(20, 5,  "?");
    }
    
}
