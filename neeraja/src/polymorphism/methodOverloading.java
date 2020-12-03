package polymorphism;


 class DisplayOverloading
{
    //overloading method with single parameter
    public void disp(char c)
    {
         System.out.println(c);
         System.out.println("I’m the  definition of method disp" );
    }
    //overloading method with change in  parameters
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
         System.out.println("I’m the first definition of method disp" );
    }
    //overloading method with change in order of parameters
    public void  disp(char num, String c)
    {
        System.out.println(num +c);
        System.out.println("I’m the second definition of method disp" );
    }
}
public class methodOverloading {
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');  //calling dispmethod which has it's argument as charecter type
       obj.disp('a',10);//calling dispmethod which has it's arguments as charecter type andd integer 
       obj.disp('j', 'h');//calling dispmethod which has it's arguments as integer type andd charecter 
    } 


}
    

