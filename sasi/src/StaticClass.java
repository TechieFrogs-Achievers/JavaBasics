class A1  //parent class
 {
   public  static void show() //method for parent class
    {
        System.out.println("parent");
    }
}
class  B1 extends A1 // child class getting properties from parent class
{
    public static void show() // child class method
    {
        System.out.println("child");
    }

}
class  StaticClass 
{
    public static void main(String[] args)
     {

       // A obj=new A();
        A1.show(); // calling method with parent class
        B1.show(); // calling method from child class

    
    }
}
