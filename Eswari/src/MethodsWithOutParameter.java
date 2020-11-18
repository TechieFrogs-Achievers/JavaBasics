public class MethodsWithOutParameter {

    //void return type without parameter
    public void addition()
    {
        float a=22.5f;
        float b=1.5f;
        float c=a + b ;
        System.out.println("Addition of two numbers is "+c);
    }

    //int return type without parameter
    public int sub()
    {
        int a=5;
        int b=5;
        return a - b;
    }

    //static string return type without parameter
    public static String add()
    {
        String str1="rama";
        String str2="eswari";
        return str1 +  str2;
    }

    //static void return type without parameters
    public static void addOperator()
    {
        boolean a= true;
        boolean b= false;
        boolean c= a & b;
        System.out.println(c);
    }

    

    public static void main(String[] args) {
        MethodsWithOutParameter mp= new MethodsWithOutParameter();
        
        //void return type calling
        mp.addition();

        //int return type without parameter calling
        int d=mp.sub();
        System.out.println("Subtraction of two numbers is "+d);

        //static string return type without parameter
        
        String str3=add();
        System.out.println(str3);

        //static void return type without parameters
        addOperator();

    }
    
}
