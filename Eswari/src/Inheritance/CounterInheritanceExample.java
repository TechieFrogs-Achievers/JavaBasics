//package Inheritance;

class Counter
{
    int i;
    public void increment(int j)
    {
        i = j;
        // System.out.println(i);
    }
}

 //class CounterChildClass extends Counter
 //{
//     this.increment(3);
// }


class CounterInheritanceExample  extends Counter
{
    public static void main(String[] args) 
    {
        // CounterChildClass c = new CounterChildClass();
        Counter c= new Counter();
        c.i=3;
        System.out.println("i = " +c.i);
        
    }    
}