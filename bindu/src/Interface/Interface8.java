package Interface;

interface Marks 
 {
     public void display(); //creating method  
 }
 public class Interface8    //outer class
 {
      class Sample implements Marks   //inner class
     {
         String s= "BINDHU";
         public void display()  //method creation 
           {
             System.out.println("the Name of student:"+s);
            }
    }
     public static void main(String[] args) 
     {
         Interface8 i = new Interface8();    //creating object for the outer class
         Interface8.Sample s = i.new Sample();
         //outerclass.innerclass obj = outerclass obj.innerclass
         s.display(); //calling the method with object 

         
     }

 }
