public class Lcm
 {
     public static void main(String[] args)
      {
          int a=6 , b=8 ,max ,step , lcm=0;
          if (a>b)
          {
              max=step=a;
          }
          else
          {
              max=step=b;
          }
          while(a!=0)
          {
              if(max%a==0 && max%b==0)
              {
                  lcm=max;
                  break;

              }
              max=max+step;

          }
          System.out.println(" lcm is  "+lcm);
         
     }
    
}
