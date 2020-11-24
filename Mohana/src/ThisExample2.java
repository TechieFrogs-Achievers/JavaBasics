public class ThisExample2 
{
  public void department()
  {
      System.out.println( " ECE ");
  }   

  public void details()
  {  
      this.department(); //by using this keyword we are caling the another method into this method 
      System.out.println( " John   12  A sec");
  } 

  public static void main(String[] args) 
  {
      ThisExample2 ex = new ThisExample2();
      ex.details(); //method call
      
  }
    
}
