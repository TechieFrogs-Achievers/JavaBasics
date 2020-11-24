class Method1 // class PrintNumber
{
    void printn(int a,int b) // method printn for int datatypes
    {
        int add=a+b; // addition of two numbers
        System.out.println("addition:"+" "+add);
    }
    void printn(float a,float b) // method overloading for float datatypes
    {
        float div=a/b; // division of two numbers
        System.out.println("Division:"+" "+div);
    }
    void printn(int a,float b) // method overloading for int,float datatypes
    {
        System.out.println("Different dataypes");
    }
    void printn(float a,int b) // method overloading for float.int datatypes
    {
        float sub= a-b; // subtraction of two numbers
        System.out.println("Subtraction:"+" "+sub);
    }
    void printn(String a,String b) // method overloading for String datatypes
    {
        String studName=a+b;
        System.out.println(studName);
    }

    public static void main(String[] args) {
        Method1 m=new Method1(); // obj creation for method1 class
        m.printn(10,20); // method calling for int datatype
        m.printn(20.0f,34.5f); // method calling for float datatype
        m.printn(45,56.5f); // method calling for int,float datatype
        m.printn(50.2f,26); // method calling for float,int datatype 
        m.printn("satya","sasi");// method calling for string datatypes
    }
}
