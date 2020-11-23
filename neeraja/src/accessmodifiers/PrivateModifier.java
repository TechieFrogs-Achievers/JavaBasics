package accessmodifiers;

//(if we make class as private), it shows error 
//Illegal modifier for the class Modifier; only public, abstract & final are permitted
  class Modifier 
{
    private int i;

   
    // private constructor
    private  Modifier(int t)
    {
        i=t;
        System.out.println("inside private constructor");
        System.out.println(i);   
    }

    //private method
    private void add(char firstnumber, int secondNumber)
    {
    int add=firstnumber+ secondNumber;
    System.out.println("inside private method, addition is:"+add);
    }   

   
    {
     //init block
     i=10;
    System.out.println(i);   
    }
  }

      class PrivateModifier
      {
        public static void main(String[] args)
         {
        // not possible to access private members from another class,
        //if not ,it shows error as member not visible
           /* Modifier p = new Modifier(10);
           Modifier p1 = new Modifier(10);

            p.i = 67;
            System.out.println(p.i);
            p.add('c',20); */

        
        
        //default class from another clas within same package
         ModifierTwo d=new ModifierTwo();
         d.add();
        }
    }

