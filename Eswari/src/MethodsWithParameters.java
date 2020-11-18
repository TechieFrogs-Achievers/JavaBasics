public class MethodsWithParameters {
    
    // void retun type with parameters
    public void multiplication(int a, int b)
    {
        int c = a * b;
        System.out.println("Multiplication of two numbers "+c); //10 * 20 =200
    }

    //int return type with parameters
    public int add(int x, int y)
    {
        return x + y;
    }

    //static return type with parameters
    public static void subtraction(int r, int s)
    {
        int t= r - s;
        System.out.println("Subtractions of two numbers "+t);  //40-30=10
    }

    public static int sub(int a, int b )
    {
        return a - b;
    }
    
    public static void main(String[] args) 
    {
        MethodsWithParameters mp= new MethodsWithParameters();
        
        //void return type calling
        mp.multiplication(10,20);
        
        //int return type calling
        int z=mp.add(10, 30);
        System.out.println("Addition of two numbers "+z);
        
        //static void return type calling
        subtraction(40, 30);

        //static int return type calling
        int d=sub(22, 10);
        System.out.println("Sub of two operators is  "+d);
        
    }
    
}
