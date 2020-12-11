package InheritanceDoc;

import java.util.Scanner;

class Squaree1 //parent class
{
    int side;
 public Squaree1(int s)//constructor having two parameters
  {
       this.side = s;
  } 

  public void area() //method to display area
  {
      System.out.println( " area is " + side *side);
  } 
  public void perimeter()//method to display perimeter 
  {
      System.out.println( "Perimeter is " + 4*side);
  }  
}

public class Program5 
{
   public static void main(String[] args) 
   {  

        Squaree1 sq[] = new Squaree1[10]; //initialzing  array obj

        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i < 10; i++) //loop for giving 10 sides 
        {  
            System.out.println("enter side value"); 
            int s = sc.nextInt(); 
            sq[i] = new Squaree1(s); 

            System.out.println("area and perimeter " +i+1 );

            sq[i].area(); //method call

            sq[i].perimeter(); //method call


        } 
        sc.close();
       
   }
    
}
