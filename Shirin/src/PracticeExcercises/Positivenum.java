package PracticeExcercises;

//import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class Positivenum 
{
   // public static void main(String[] args) 
    //{
        // Scanner sc = new Scanner(System.in);
        // int  num = sc.nextInt();
        public void demo(int num)
        {
        
            if(num < 0)
        {
            System.out.println("negative number :");
        }
        else if( num > 0)
        {
          System.out.println("positive number ");
        }
        else
        {
            System.out.println();
        }
      }
        //sc.close();
        public static void main(String[] args) 
        {
           Positivenum p = new Positivenum();
           p.demo(8);
          // p.demo(-4);
        }
        
    }
    
