package Methods;

public class MethodExercise3
 {
     //method overloading
     public void Demo(int length , int breadth) //parameterised method
     {
         System.out.println("area of rectangle  :" + length*breadth); //print the area of rectangle
     }
     public void Demo(int s) 
     {
         System.out.println("area of square :"+ s*s); //print the area of square
     }
     public static void main(String[] args) 
     {
         MethodExercise3 m = new MethodExercise3(); //creating object
         m.Demo(5,4); //calling method
         m.Demo(5);
         
     }
    
}
