class Sample
{
    public void sum(int a,int b)            //overridden method
    {
        System.out.println(a+b);
    }
}

class Value extends Sample
{
    public void sum(int a, int b)       //overriding method
    {
        System.out.println(a-b);
    }

    public void mul(int a,int b)        //overriding method
    {
        System.out.println(a*b);
    }
}

public class PolymorphismRtEx2 
{
     public static void main(String[] args) 
     {
       
        // When Parent class reference refers to the parent class object.
	    // then in this case overridden method is called
        
         Sample s = new Sample();
         s.sum(7,2);
        
       
       
       //when parent class reference refers to the child class object
       //then overriding method is called
       
       Sample ss = new Value();
        ss.sum(7,2);
        

    }
}
