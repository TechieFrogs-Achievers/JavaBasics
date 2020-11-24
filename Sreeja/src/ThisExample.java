public class ThisExample
 {
    
    
    public ThisExample()    //default constructor
    {
        this(6);        //invokes single parameter constructor
        System.out.println("constructor chaining");
    }
    
    public ThisExample(int data,int sample) //two parameter constructor
    {
        //this(); //invokes default constructor
        System.out.println(data+sample);
    }
    public ThisExample(int data) //single parameter constructor
    {
        System.out.println(data);
    }
     public static void main(String[] args) 
     {
          new ThisExample(6,6);  //invokes two parameter constructor
        
    }

}
