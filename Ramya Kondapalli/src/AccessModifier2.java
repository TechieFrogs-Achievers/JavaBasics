class modifier2{
    protected String name;//Instance variable
    
    private void display() {
        System.out.println("Inside private method");
        System.out.println(name);
    }
    public void read()
    {
        //calling public method from private methods
        display();
        System.out.println("Inside public method");
        //m1.read();
    }
    protected void show()
    {
        //callig previous class method from protected method
        read();
        System.out.println("Inside protect method");
    }
}
//another class is created
class modifier1{
    //create obj to the previous class
    modifier2 m1 = new modifier2();
    public void diplay2()
    {//calling previous class protected method
        m1.show();
    }
    protected void show2()
    {
        //calling previous class public method 
        m1.read();
    }
    private void read2()
    {
        //calling 
        m1.read();
        m1.show();
    }
}

public class AccessModifier2 {
    public static void main(String[] args) {
        modifier2 m = new modifier2();
        m.name = "Ramya";//variable intialising
        m.show();//calling protect method
    }
}
