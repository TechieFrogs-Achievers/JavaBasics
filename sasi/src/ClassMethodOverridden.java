class A //parent class
 {
    // public static A a;
     int i, j;
         A(int a,int b) //constructor for parent class
        {
            i=a; // data members
            j=b;
        }
            public void show() //method for parent class
            {
        System.out.println(i);
        System.out.println(j);
    }   
}
class B extends A // child class getting properties from parent class 
{
   // public static B b;
    int k;   // data member
    B(int c) // constructor for cild class
    {
        super(c,c); //super method inherit the parent class
        k=c;
    }
        public void show() // method for chlid class
        {
            System.out.println(k);

        }
    }
    class ClassMethodOverridden 
    {
        public static void main(String[] args)
         {
             B b=new B(3); //object creation for child class
             b.show(); // calling the method with object from child class
             A a=new A(5,6); //object creation for parent class
             a.show();   //calling the method with object from parent class
			//((A) a).show(); 
            
        }
    }

