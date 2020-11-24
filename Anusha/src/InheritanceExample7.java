public class InheritanceExample7
{
    public static void main(String[] args) 
    {
       Counter c=new Counter();//create  aobject
       c.increment(); //method calling    
       SubClass s=new SubClass();//create a object
       s.increment();//calling method
       
    }
}
class Counter//parent class
{
    int i=1;
    //create increment method
    public void increment()
    {
       i++;
       System.out.println("i value is:"+i++);
    }
}
class SubClass extends Counter//create child class of counter class
{
     public void increment()
    {
        this.i++;//take current value
        i++;//increment current value
       System.out.println("i ="+ i++);//display value
    }
}