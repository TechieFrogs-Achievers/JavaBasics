package MethodsExamples;

  //method overriding concept

class Degree
{    //overridden method
    public void getDegree() //method to display information 
    {
        System.out.println("I got a Degree");
    } 
} 
class UnderGraduate extends Degree
{    
    //overridding  method

    public void getDegree() //method to dispaly informaion  
    {
        System.out.println("Iam a  undergraduate ");
    }
} 
class PostGraduate extends Degree
{    
    //overriding method

    public void getDegree()//method to display
    {
        System.out.println("Iam a postGraduate ");
    }
}

public class Example5 
{
   public static void main(String[] args) 
   { 
       Degree de = new Degree();  //creating ab object or parent class
       de = new UnderGraduate(); //with parent obj refrence we can create an subclass obj
       de= new PostGraduate();//with parent refrence we can create an subclass obj
       de.getDegree(); // calling parent class method
       de.getDegree(); // calling subclass meyhod using parent obj
       de.getDegree(); // calling subclass meyhod using parent obj
       
       
   }
    
}
