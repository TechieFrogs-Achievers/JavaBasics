import javax.lang.model.util.ElementScanner14;

public class IfElseIf 
{
    //main method
   public static void main(String[] args)
   {
     int num=12345;
     //find the how many digit of a number
     if(num<100 && num>=1)//false && true=false
     {
         System.out.println("its a two digit number:"+num);
     } 
     else if(num<1000 && num>=100)//false && true=false
     {
         System.out.println("its a three digit number:"+num);
     }
     else if(num<10000 && num>=1000)//false && true=false
     {
         System.out.println("its a four digit number:"+num);
     }
     else if(num<100000 && num>=10000)//true && true=true
     {
         System.out.println("its a five digit number:"+num);
     }
     else//if all conditions false then else block excuted
     {
        System.out.println("the number is not found in between 1-99999");
     }

   } 
}
