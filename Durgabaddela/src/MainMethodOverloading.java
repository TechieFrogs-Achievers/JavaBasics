public class MainMethodOverloading
{
    //overloading main method

  public static void main(char args)
  {
      System.out.println("im override method1 of main ");
  }
  public static  void main(int args)
  {
      System.out.println("im override method2 of main ");
  }
  public static void main(Byte args)
  {
      System.out.println("im override method1 of main ");
  }
  public static void main(String[] args)
  {
      System.out.println("im original main method");
      MainMethodOverloading.main('c');
      MainMethodOverloading.main(54);
      MainMethodOverloading.main(2);
  }
  



    
}
