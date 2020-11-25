package MethodsPractices;
//parent class

class Degree 
{
     public void getDegree()
     {
         System.out.println(" I got Degree");
     } 


}

//sub class 

class Undergraduate extends Degree
{
    public void getDegree()
    {
        System.out.println(" I am an Undergratuate");
    }

}

//another subclass

class Postgraduate extends Degree
{
    public void getDegree()
    {
        System.out.println(" I am a postgraduate");
    }
}
public class MethodExample3
{
     public static void main(String[] args)
     {
         //creating object for parent class

         Degree d = new Degree();
         d.getDegree();//calling the method

         //creating object for child class

         Undergraduate u = new Undergraduate();
         u.getDegree();

         //creating object for child class

         Postgraduate p = new Postgraduate(); 
         p.getDegree();
     }
}

    

