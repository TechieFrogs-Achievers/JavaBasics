public class Class {
    int i;
   public void printNum()
   {
       System.out.println("The value of i is:"+i);
   }
}
    class Class1 extends Class {
    int j;
   public void printNum()
   {
       System.out.println("The value of j is:"+j);
   }

   public static void main(String args[]) {
       //Class c1= new Class();
      Class1 c= new Class1 ();
      c.i=2;
      c.j=3;
      c.printNum();
   }


}
