abstract class Marks
{
   abstract void getpercentage();//methode
}
class StudentA extends Marks
{
    int subject1,subject2,subject3,total;
    double percentage;
    StudentA(int a, int b,int c)// constructor
    {
        subject1=a;subject2=b;subject3=c;
    }
    
    void getpercentage()//methode
    {
        
        int total=subject1+subject2+subject3;
        double percentage=(total/(300.0))*100;
    {
        System.out.println("studentA total:"+" "+total);
        System.out.println("studentA percentage:" +" "+percentage);
    }
    }
}
class StudentB extends Marks
{
    int subject1,subject2,subject3,subject4,total;
    double percentage;
    StudentB(int a,int b, int c, int d)// constructor
    {
        subject1=a;subject2=b;subject3=c;subject4=d;
    }
    void getpercentage()
    {
      
        int total=subject1+subject2+subject3+subject4;
        double percentage=(total/(400.0))*100;
    {
        System.out.println("studentB total:"+" "+total);
        System.out.println("studentB percentage:" +" "+percentage);
    }
    }
}
public class AbstractMarks
{
    public static void main(String[] args) 
    {
       
        StudentA sa=new StudentA(98,87,66);//accending valu
        sa.getpercentage();
        StudentB sb=new StudentB(78,88,99,77);//accesnding value
        sb.getpercentage();
    }
}