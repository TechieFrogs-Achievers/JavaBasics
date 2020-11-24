class A //  using inheritance A class as parent class
{
    int i,j; // datamembers
    A(int a,int b) // constructors of parent class
    {
      i=a; // intializing datamembers to parameters
      j=b;  
    }
    void show(int a,int b) // method for parent class
    {
        System.out.println("i value:"+i+" "+"j value:"+j);
    }
}
class B extends A // child class 
{
    int k; // datamember
    B(int c) // Constructors for child class
    {
        super(c,c); //super class 
        k=c;

    }
    void show() // method for child class
    {
        System.out.println("k value"+k);
    }
}
class Inheritance8 // main class
{
    public static void main(String[] args) {
        B b=new B(30); // obj creation for child class
        b.show(); //method calling foe show method for parent class
        b.show(10,20); // method calling for show method for child class
        
    }
}
