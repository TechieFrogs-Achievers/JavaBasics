 class Parent1
     {
    private void p2() //method for parent class
    {
        System.out.println("this is parent class");
    }  
}
class Child2 extends Parent1 //child class aquring the properties of parent class
{
    void C2()  // method for child class
    {
        System.out.println("this is child class");
    }
}
class ClassMethod2
{
    public static void main(String[] args) 
    {
       // Parent1 p=new Parent1();  //object creation for parent class
       // p.p2();                 //parent object calling parent method but we declared parent class as private so it cause run time error..
        Child2 c=new Child2();   //  object creation for child class
       c.C2();                 // child object  calling child method
      // c.p2();                 // child object calling parent method
    }
}

