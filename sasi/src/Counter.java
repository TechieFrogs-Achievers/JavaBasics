class  Count // parent class
{
    int i;
    void increment(int i) //method for parent class
    {
       System.out.println(i);
    }
}
class Counter extends Count //child class aquring properites from parent class
{
    public static void main(String[] args) 
    {
        Counter c=new Counter(); // object creation for child class
       // c.i=3;
        c.increment(3); //calling the method from child class
    }
    }
