public class NestedFoor 
{  
    //main method
    public static void main(String[] args)
    {
        //outer for loop
      for(int i=1;i<=3;++i)
      {
          //inner for loop
          for(int j=1;j<=2;++j)
          { 
             System.out.println("i="+i+";j="+j);
          }
          System.out.println("outer loop iteration"+i);
        } 
      }
}
