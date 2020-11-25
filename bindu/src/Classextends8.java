    class A
    {
        int k,l; // assigning member variables k,l
        A(int a, int b) // creating constructor for the class  
        {
            k=a;
            l=b;
        }
        void show() //creating method show()
        {
            System.out.println("k value is:"+k+" "+"l value is:" +l);
        }
    }
    class B extends A //class B child class inherits the parent class A
    {
        int m;
        B(int c)
        {
            super(c,c); 
            m=c;
        }
        void show() 
        {
            System.out.println("c value "+m);
        }
    }
    class Classextends8 
    {
        public static void main(String[] args)
         {
            B b = new B(5); //creating object for the childclass & assigning value to it
            b.show(); //calling the childclass method
        }
    }
    
    

