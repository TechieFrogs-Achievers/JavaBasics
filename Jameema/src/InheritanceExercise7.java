class Counter
{
    int i=3; //assiging value to variable
    public void Increament() 
    {
        System.out.println("i=" +i); //printing i value

    }
}

public class InheritanceExercise7 extends Counter //interits parent class
 {
     public static void main(String[] args)
      {
          Counter c = new Counter(); //creating object 
          c.Increament();
         
     }
    
}
