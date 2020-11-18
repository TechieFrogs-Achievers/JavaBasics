public class Method1
 {
     //void with parameters
     public void add( int i, int j)
     {
         int k = i+j;
         System.out.println(k);
     }
       //int with parameters

      public int multiplication( int a, int b) 
      {
         return a*b;
      }

      // void without parameters
        public void  sub ()
        {
            int a = 10;
            int b = 20;
            System.out.println(a-b);
        } 
        // int without parameters 
        public int divi ()
        {
             int x = 9;
             int y = 12;
             return  x/y;
        }
    
     public static void main(String[] args) 
     {
       Method1 m = new Method1();
       m.add(5,9);
       int n = m.multiplication (5,9);
       System.out.println(n);
       m.sub();
       int  l = m.divi();
       System.out.println(l);



     }

     
       



    
}
