abstract class Marks
{
    abstract void getPercentage();
}
class StudentA extends Marks{
    int sub1,sub2,sub3;
    StudentA(int s, int s1,int s2)
    {

        int sub1 = s;
        int sub2 = s1;
        int sub3 = s2;
 }

    void getPercentage()
    {
       int  sum = sub1+sub2+sub3;
        int percentage =(sum/300)*100;
        System.out.println("The percentage of studentA is: "+" Percentage is :"+percentage);
    }

}
class StudentB extends Marks{
    int sub1,sub2,sub3;
 StudentB(int s, int s1,int s2,int s3)

    {
        int sub1 = s;
        int sub2 = s1;
        int sub3 = s2;
        int sub4 = s3;

    }

    void getPercentage()
    {
        int  sum = sub1+sub2+sub3;
        int percentage =(sum/400)*100;
        System.out.println("The percentage of studentB is: " + "Percentage is:" + percentage);
    }
}
    public class AbstractClass3 {
        public static void main(String[] args) 

        {
            Marks m = new StudentA(90,80,70);
            Marks m1 = new StudentB(90,80,70,95);
           // Marks m = new StudentA();
           // Marks m1 = new StudentB();
           System.out.println(m);
           System.out.println(m1);


        }
    
}
