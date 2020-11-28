abstract class Marks // abstract class as Marks
{
    abstract int getPercentage();  // abstract method as getPercentage()
}
class StudentA extends Marks // Subclass1 as StudentA extending abstract class
{
    public int sub1,sub2,sub3;
    StudentA(int s1,int s2,int s3) // constructor for subclass1
    {
       sub1=s1;
       sub2=s2;
       sub3=s3;
    }
    public int getPercentage() // calling abstract method
    {
       int percentage1=(sub1+sub2+sub3)/3; 
        return percentage1;
    }
}
class StudentB extends Marks // Subclass2 extending abstract class Marks
{
    int sub1,sub2,sub3,sub4;
    StudentB(int s1,int s2,int s3,int s4) // constructor for subclass2
    {
        sub1=s1;
        sub2=s2;
        sub3=s3;
        sub4=s4;

    }

    public int getPercentage() // calling abstract method
    {
        int percentage=(sub1+sub2+sub3+sub4)/4;
        return percentage;
    }
}
class AbstractClass3 // driver class
{
    public static void main(String[] args) {
        Marks sb=new StudentB(65,56,86,45); // upcasting for StudentB
        System.out.println(sb.getPercentage()); //Method calling for getPercentage() of StudentB
        Marks sb1=new StudentA(53,64,58); // upcasting for StudentA
        System.out.println(sb1.getPercentage());// Method calling for getPercentage() of StudentA
    }
}
