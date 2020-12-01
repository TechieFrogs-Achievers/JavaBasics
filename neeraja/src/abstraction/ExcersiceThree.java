package abstraction;

// abstract class
abstract class Marks{
    int sub1, sub2, sub3,sub4;
  abstract void getPercentage();//abstract method
}

//subclass implementing body for abstract method
class StudentA extends Marks{

    //constructor to assign marks to sunjects of stident
      StudentA(int sub1,int sub2,int sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    //implementation of abstract method
    public void getPercentage(){
      float total=(sub1+sub2+sub3);
      System.out.println(total/300);
      float percentage=(float)((total/300));

      System.out.println("percentage gained by studentA is:"+percentage);
    }
}

//subclass implementing body for abstract method
class StudentB extends Marks{
     //constructor to assign marks to sunjects of stident
    public StudentB(int sub1,int sub2,int sub3,int sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    //implementation of abstract method
    public void getPercentage(){
      int total=(sub1+sub2+sub3+sub4);
      float percentage=((total/400)*100);
      System.out.println("percentage gained by studentA is:"+percentage);
    }
}

//main class
public class ExcersiceThree {
     public static void main(String[] uh){

        //instantiation of bankA using parent class reference
        StudentA  a=new StudentA(52,62,85);
        System.out.println(a.sub1+" "+a.sub2+" "+a.sub3);
        a.getPercentage();//calling getpercentage method using  reference

        //instantiation of bankA using parent class reference
        StudentB  b=new StudentB(52,62,85,90);
       // b.getPercentage();//calling getpercentage method using  reference
     }
}
