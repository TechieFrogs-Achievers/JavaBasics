class Super
{  
    //creating method
   public void  demo( int a, int b)// intiallizing 
  {
      System.out.println(a+b);// print sum
  }
  public void demo(float i , float j)
  {
      System.out.println(i*j);
  }
  public void demo (String s1,String s2)
  {
      System.out.println(s1+s2);// concate the two strings
  }

    
}
// main class
public class  SampleExercise4
{
    public static void main(String[] args) 
    {   
        // creating method 
        Super s = new Super();
        // calling methods with object
        s.demo(12, 12);
        //s.demo(35.00f, 12.0f);
        s.demo("method", "overloading");
        
    }
}

