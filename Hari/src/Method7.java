// Creating  Parent class
class First 
{
    void printNum(int i)
    {
        System.out.println(i);
    }
}
// Creating sub class and super class for next class
class Second extends First
{
    void printNum( int j)
    {
        System.out.println(j);
    }
}
// creating sub class
class Method7 extends Second
{
    public static void main(String[] args)
    {
        First i = new First();
        Second j = new Second();
        i.printNum(28);
        j.printNum(41);
    }
}

