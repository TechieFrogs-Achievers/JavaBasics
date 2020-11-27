class Operateroverloading // class overloading 
{
     void  show(int a ,int b) //methofd foer class 
     {
         System.out.println("Addition:"+(a+b));
     }
     void show(String s, String s1) // method  for class 
     {
         System.out.println("String concatinate:"+(s+s1));
     }
    }
    class Operateroverloading1
    {
        public static void main(String[] args)
        {
            Operateroverloading op=new Operateroverloading(); //object created for class
            op.show(10,20); // calling method with object from class
            op.show("krovvidi.","sasi");  // // calling method with object from class
        }
    }

