package Abstract;

abstract class Marks 
{
    abstract int getPercentage();   //creating the method 
    
}
class StudentA extends Marks
{
    int soc,eng,hindi;
    StudentA(int a,int b,int c)     //create the constructor with the parameters
    {
        soc = a;
        eng = b;
        hindi = c;   //assigning the parameters
    }
    int getPercentage()   //method accessor
    {
        return((soc+eng+hindi)/3);   //return sum/total
    }
}
class StudentB extends Marks
{
    int math,sci,tel,chem;
    StudentB(int a, int b, int c, int d)     //constructor with the parameters
    {
        math = a;
        sci = b;
        tel = c;
        chem = d;
    }
    int getPercentage()
    {
        return((math+sci+tel+chem)/4);
    }
    public static void main(String[] args) 
    {
        Marks m = new StudentA(75,72,65);
        Marks m1 = new StudentB(75,74,65,53);  //upcasting
        m.getPercentage();
        m1.getPercentage();
        System.out.println("the percentage of student:"+m.getPercentage()+"%");  //prints the values
        System.out.println("the percentage of student:"+m1.getPercentage()+"%");
 
    }
}