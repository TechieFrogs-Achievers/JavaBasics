package InheritenceExcercises;
//parent class as counter

class Counter
{
    
    public void increment(int i)
    {
    
        System.out.println("i="+i);
    }
}
//subclass inherites parent class

class Inheritance6  extends Counter
{
    public static void main(String[] args) 
    {
        Inheritance6 c = new Inheritance6();
        c.increment(3);

    }    
} 
 
    

