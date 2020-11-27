package AbstractionExamples;

abstract class Marks //abstract class
{
    abstract void getPecentage(); //abstract method
} 
class A extends Marks
{   
    int sub1,sub2,sub3; //variables
    public A(int s1 ,int s2, int s3 )//constructor having 3 params 
    {
      this.sub1 =s1;
      this.sub2=s2;
      this.sub3 = s3;
    }
    void getPecentage() //method implementation
    {
         double total = (sub1 + sub2 + sub3);
         double percentage = (total/300)*100;
         System.out.println("percentage of studenr B is : " +percentage);
    }

}
class B extends Marks //sub class2
{   
    int sub1,sub2,sub3 , sub4 ;
    public B(int s1 ,int s2, int s3,int s4 )//constructor having 4 params
    {
      this.sub1 =s1;
      this.sub2=s2;
      this.sub3 = s3;
      this.sub4 = s4;
    }
    void getPecentage()//implementation of abstrct method
    {
         double total = (sub1 + sub2 + sub3 +sub4);
         double percentage = (total/400)*100;
         System.out.println("percentage of studenr A is : " +percentage);
    }

}



public class Program3 
{
    public static void main(String[] args) 
    {  
        //obj creation
        A a = new A(75,70,80);
        a.getPecentage();
        B b = new B(95,76,85,90);
        b.getPecentage();
        
    }
    
}
