package InterfaceExamples;

interface Animal
{
   String name = "Iterface"; //here we have to intialize the variable because in interface variables are static and final 
   int cost = 800; 
}
public class Program4 implements Animal //implementing interface
{   
    public static void main(String[] args) 
    { 
     System.out.println(Program4.name); //we call varible directly by using class name because static
     System.out.println(Program4.cost);
    }

     
}
