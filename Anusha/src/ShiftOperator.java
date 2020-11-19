public class ShiftOperator 
{
    //liftshift method
    public void liftShift()
    {
     System.out.println(20<<5);//20*(2^5)=20*32=640
     System.out.println(15<<8);//15*(2^8)=15*256=3840
    }

    //rightshift method
    public void rightShift()
    {
        System.out.println(20>>5);//20/(2^5)=20/32=0.625(it returns only int value is 0)
        System.out.println(15>>2);//15/(2^2)=15/4=3.75(it returns only int value is 3)
    }

    //main method
    public static void main(String[] args)
    {
      System.out.println("Main Method is excuted:");
      ShiftOperator so=new ShiftOperator();//create an object to a class
      so.liftShift();//calling method
      so.rightShift();  //calling method
    }
}
