class Counter
{   
    int i;
    void increment(int i)//using with parameter
    {
        System.out.println("i =  " +i);//print i 
    }

    
}
// create a child class for counter
class counter1 extends Counter
{
    public static void main(String[] args)
    {
        Counter c = new Counter();//Assigning object for 1st class
        c.increment(3);//calling method with object
        
    }

}
