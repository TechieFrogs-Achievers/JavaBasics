public class TypePromoting
{ 
  public void m1(double a) 
  { 
    System.out.println(a+a); 
  } 
 public void m1(short a) 
 { 
    System.out.println(a+a); 
  } 
 public static void main(String[] args) 
 { 
    TypePromoting t = new TypePromoting(); 
      t.m1(2); // Exact match is not found for passing argument 2 because 2 is an integer data type. 
  } 
 }