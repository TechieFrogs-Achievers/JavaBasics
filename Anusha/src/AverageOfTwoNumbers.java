class Average
{
  int num1,num2,num3;
  //avreage of three numbers
  public void  calculate(int n1,int n2,int n3)
  {
      num1=n1;num2=n2;num3=n3;
      int total=(num1+num2+num3);//sum of three numbers
      double average=total/3;//avreage of three numbers
      System.out.println("The average of three numbers is: "+average);
  }
}

public class AverageOfTwoNumbers 
{
    public static void main(String[] args) 
    {
      Average a=new Average();//create object for Average class 
      a.calculate(4,5,6); // method calling 
    }
}
