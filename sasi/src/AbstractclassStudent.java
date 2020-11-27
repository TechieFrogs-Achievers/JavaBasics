 abstract class Marks //abstract class 
 {
     abstract int getPercentage(); //abstract methods 
 }
 class MarksA extends Marks // parent class geeting properties of abstract class
 {
     int social,science,maths,physics; //data members 
    int getPercentage() // parent method
     {
         return ((social+science+maths)/3);
     }
     MarksA(int a,int b,int c) //constructor for parent class
     {
        social=a;
        science=b;
         maths=c;
         System.out.println("social="+a+"  "+"science="+b+"    "+"maths="+c);
     }
 }
 class MarksB extends Marks //child getting properties from abstract class
 {
     int social,science,maths,physics; // data members
    int getPercentage() // method for child class
     {
         return ((social+science+maths+physics)/4);
     }
     MarksB(int i,int j,int k,int l) // constructor for parent class
     {
        social=i;
        science=j;
         maths=k;
         physics=l;
         System.out.println("social="+i+"  "+"science="+j+"    "+"maths="+k+"  "+"physics="+l);
     }
 }
 public class AbstractclassStudent
 {
     public static void main(String[] args) 
     {
         Marks m=new MarksA(87,80,99);  //  object  created for parent class by upcasting
   // m.getPercentage()
   System.out.println("outof100:"+m.getPercentage()+"%");
   Marks m1= new MarksB(78,87,98,79); // object  created for parent class by upcasting
   System.out.println("outof100:"+m1.getPercentage()+"%");
     }

}
