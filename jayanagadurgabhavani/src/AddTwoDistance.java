public class AddTwoDistance 
{
    public void distance(int inch1,int inch2, float feet1,float feet2)
    {
        int inches= inch1 + inch2;
        float feet=feet1 + feet2;
        // used y int and float valuse
        if(inches > 12)
        // if statement true condhition checking process
        {
            feet++;
            inches=inches-12;

        }
        System.out.println("Inches : " +inches +"  " +"Feet : " +feet);
    }
      public static void main(String[] args) 
      {
          // by using of constractor
        AddTwoDistance atd= new AddTwoDistance();
        atd.distance(6, 4, 5, 4);
    }
}
