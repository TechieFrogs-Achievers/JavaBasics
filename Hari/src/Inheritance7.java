// Creating Parent class
class Counter
{
    int i ;
    void increment( int i) // method to increment the given number
    {
        System.out.println(" i = " + ++i);
    }   
}
// Creating Child class
class Inheritance7 extends Counter
{
    public static void main (String[] args)
    {
        Counter c = new Counter();
        c.increment(2);
    }
}
