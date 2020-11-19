public class SwitchExample
{
 
    public static void main(String[] args)
    {
       byte data=5;
       int value=4;


       int sample=2;
      switch(sample)
      {
          case 1: System.out.println(data+value);
                  break;
          case 2: System.out.println(data-value);
                  break;
          case 3: System.out.println(data*value);
                  break;
          case 4: System.out.println(data/value);
                  break;
          case 5: System.out.println(data%value);
                  break;
      }

    }
}
