class Student1
    {
        protected Student1()
         {
             int rollno;
             System.out.println("rollno");
         }
         Student1(int age)
         {
             this();
             System.out.println( age);
            }
            Student1(double phno)
            {
                this(37);
                System.err.println("phno");
            } 
         }
        public class ThisStudent
         {
             public static void main(String[] args)
              {
                 Student1 ts=new Student1(234555.22);
              }
             
         }
         