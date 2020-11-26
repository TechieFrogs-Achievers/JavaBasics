public class MethodOverriding 
{
    public static void main(String[] args) 
    {
       ABC obj=new ABC();//object creation for parent class
       obj.display(5);//caaling method assign value to i
       Demo d=new Demo();//object create for child class
       d.display(5);//caaling method assign value to i

    }
}
//parent class
class ABC
{
    void display(int i)//method for display i value
    {
         System.out.println("parent class :i value="+i);
    }
}
class Demo extends ABC//subclass of ABC class
{
   void display(int i)//method overriding 
   {
       i++;
    System.out.println("child class: i value="+i++);  
   }
}