public class AbstractExcercise3 
{
    public static void main(String[] args) 
    {
       Marks sa=new StudentA(75, 75, 85);//assign values
       sa.getPercentage();//calling method
       Marks sb=new StudentB(75, 84, 70, 90);//assign values
       sb.getPercentage();//calling method 
    }
}
abstract class Marks//abstract parent class
{
    abstract void getPercentage();
}
class StudentA extends Marks//subclass of abstract class
{
    int sub1,sub2,sub3;
    float percentage,total;
    
    StudentA(int a,int b,int c)//constructor
    {
      sub1=a;sub2=b;sub3=c;
    }
    void getPercentage()//method for calculate percentage
    {
        total=sub1+sub2+sub3;
        percentage=(float)(total / (300))*100;
        System.out.println("Total percentage of a student:"+percentage+"%");
    }
}
class StudentB extends Marks//subclass of abstract class
{
    int sub1,sub2,sub3,sub4;
    double percentage;
     StudentB(int a,int b,int c,int d)//constructor
    {
        sub1=a;sub2=b;sub3=c;sub4=d;
    }
    void getPercentage()//method for calculate percentage
    {
        float total=sub1+sub2+sub3+sub4;
        percentage=(total / 400)*100;
        System.out.println("Total percentage of a student:"+percentage+"%");
    }
}