package AbstractClasses;

//abstract class
abstract class Marks{
    abstract float getPercentage(int a,int b,int c,int d); //abstarct method
}
class StudentA extends Marks{
    
    //implmentation of abtract method to calculate percentage of studentA
    float getPercentage(int sub1, int sub2, int sub3, int sub4) {
        
        float total = sub1 + sub2 + sub3 +sub4;
        float percent = total/4;
        return percent;
    }
}
class StudentB extends Marks{

    //implmentation of abtract method to calculate percentage of studentA
    float getPercentage(int sub1, int sub2, int sub3, int sub4) {
        
        float total = sub1 + sub2 + sub3 +sub4;
        float percent = total/400;
        return percent*100;  
    }
}
//main class
public class AbstractExcercise3 {
    public static void main(String[] args) {
        //creation of objects to classes
        StudentA a = new StudentA();
        StudentB b = new StudentB();
        //printing percetages of both students by getpercentage()
        System.out.println(a.getPercentage(82,96,89,95) + " %");
        System.out.println(b.getPercentage(79,88,92,87) + "%");
    }
}
