
class PrintNum
{
    int integer ;
    char Character ;
    void myMethod(int a , char b)
    {
        integer = a ;
        Character = b ;
        System.out.println(integer + " " + Character);
    }
    void myMethod(char a , int b)
    {
        Character = a ;
        integer = b;
        System.out.println(Character + " " + integer);
    }
}
class Method2
{
    public static void main(String[] args)
    {
        PrintNum obj = new PrintNum ();
        PrintNum cls = new PrintNum();
        obj.myMethod(4 , 'v');
        cls.myMethod('h' , 6);
    }
}

