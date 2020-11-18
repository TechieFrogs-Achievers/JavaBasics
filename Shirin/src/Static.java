public class Static 
 {
     //static  void with parameters
     static void add( int i, int j)
     {
         int k = i+j;
         System.out.println(k);
     }
       // static int with parameters

      static int multiplication( int a, int b) 
      {
         return a*b;
      }

      //  static void without parameters
        static void  sub ()
        {
            int a = 32;
            int b = 37;
            System.out.println(a-b);
        } 
        //  static int without parameters 
        static int divi ()
        {
             int x = 22;
             int y = 15;
             return  x/y;
        }
    
     public static void main(String[] args) 
     {
       
       Static.add(32,37);
       int n = Static.multiplication (16,20);
       System.out.println(n);
       Static.sub();
       int  l = Static.divi();
       System.out.println(l);



     }
    
}
