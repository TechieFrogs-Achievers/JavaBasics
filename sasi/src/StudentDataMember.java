class Degree // parent class
{ 
    void  getDegree() // method for parent class
    {
        System.out.println("i got a degree");
    }
}
    class Undergraduate extends Degree //child class getting properties from parent class 
    {
        void getDegree() // method for child class
        {
            System.out.println("i am a undergraduate");
        }
    }
        class Postgraduate extends Degree //grand child getting properties from parent class
        {
            //super(s)
            void getDegree() // method for grand child
            {
            System.out.println("i am a postgraduate");
        }
    }
    class StudentDataMember 
    {
        public static void main(String[] args) 
        {
            Degree s= new Degree(); // object creation for parent class 
            s.getDegree(); //calling mthod with object from parent class
            Undergraduate u=new Undergraduate(); //object creation for child  class 
            u.getDegree(); //calling mthod with object from child class
            Postgraduate p=new Postgraduate(); //object creation for grand child class 
            p.getDegree(); //calling mthod with object from grand child class
        }
    }

