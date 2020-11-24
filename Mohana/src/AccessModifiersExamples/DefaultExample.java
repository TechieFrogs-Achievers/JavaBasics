package AccessModifiersExamples;

 class DefaultExample 
{
   String name = " ISts ";
   void display()
   {
       System.out.println(" Default method ");
   } 
   public static void main(String[] args) 
   {
       DefaultExample deex = new DefaultExample();
       deex .display();
       
   }
}
