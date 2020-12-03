

class Student1 implements Student
{
  public void getAttendance(float no_of_presentdays,float no_of_days)
  {
    float attendance=no_of_presentdays/no_of_days;
    System.out.println("Attendance:"+attendance);
  }
  public void getMarks(int sub1,int sub2,int sub3)
  {
    int  marks=sub1+sub2+sub3;
    System.out.println("Marks:"+marks);
  }
  public void getPercentage(int marks)
  {
    float percentage=marks/3;
    System.out.println("Percentage:"+percentage);
  }
}

