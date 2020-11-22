public class ThisExample
 {
    
    public ThisExample()    //default constructor
    {
        this(6);        //invokes single parameter constructor
        System.out.println("constructor chaining");
    }
    public ThisExample(int data,int sample)
    {
        this(); //inv
        System.out.println(data+sample);
    }
    public ThisExample(int data)
    {
        System.out.println(data);
    }
     public static void main(String[] args) 
     {
          new ThisExample(6,6);
        
    }

}
