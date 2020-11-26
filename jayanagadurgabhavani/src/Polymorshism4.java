

    class  Bick//class1
    {
      void run()
      {
          System.out.println("bick is running");
      }
    }
     class Bick2 extends Bick//class2
    {
        void run2()
        {
            System.out.println("bick is running safely");
        }
    }
    public class Polymorshism4 
    {
         public static void main(String[] args) 
    {
        Bick p=new Bick();//methode
        p.run();
        Bick2 b=new Bick2();//methode
        b.run2();
    
    }
}
