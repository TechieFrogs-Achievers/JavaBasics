public class PrintNumber 
{
    //diffrent tyoes of datatype
int inter_value;
float float_vlaue;
double double_value;
long long_value;
String name;
//diffrent types of methides are used
   public void print(int inter_value)
   {
       System.out.println(inter_value);
   }
   public void print(float float_value)
   {
       System.out.println( float_vlaue);
   }
   public void print(double double_value)
   {
       System.out.println(double_value);
   }
   public void print(long long_value)
   {
    System.out.println(long_value);
   }
   public void print(String name)
   {
    System.out.println(name);
   }

     public static void main(String[] args) 
    {
        
        {
        PrintNumber pt=new PrintNumber();
          pt.print(566);  
        }
    
        {
        PrintNumber pt=new PrintNumber();
          pt.print(56.66f);
        }
    
       {
        PrintNumber pt=new PrintNumber();
        pt.print(5666666d);
        }
        
        {
        PrintNumber pt=new PrintNumber();
        pt.print(5666666l);
        }
    
     {
        PrintNumber pt=new PrintNumber();
        pt.print("jaya");
     }
}  
    
}
