import java.util.*;
public class ConditionChecks 
{
    public static void main(String... tg)
    {
/* 1.If condition
    String language="java";
    if(language=="java")
    {
        System.out.println("condition satisfied");
    } */

/*// 2.if else condition
char firstCharecter='d';
double secondCharecter=56.3456;
if(firstCharecter>='d' || secondCharecter!=56.3456)
{
    System.out.println("If condition satisfied");
}
else
{
    System.out.println("condition not satisfied");
}  */

// 3.if else lader
String firstName="dina";
String secondName="dina";
 int m=firstName.compareTo(secondName);
 if(m==0)
 {
    System.out.println("strings are equal");
 }
else if(m>0)
 {
    System.out.println("firstname is greaterthan secondname");
 }
 else 
 {
    System.out.println("firstname is lesserthan secondname");
 }


    
/*  // 4.lader if statements
int x = 30;

if( x == 10 )
{
    System.out.print("Value of X is 10");
}
else if( x == 20 )
{
    System.out.print("Value of X is 20");
}
 else if( x == 30 )
{
     System.out.print("Value of X is 30");
}
else 
{
     System.out.print("This is else statement");
}  */

// 5.switch case
 String operater="/";
 float firstDigit=67;
 char secondDigit='L';
 double sum=0;

switch(operater)
{
    //case statements
    case "+" :
    sum=firstDigit+secondDigit;
    break;
    case "-" :
    sum=firstDigit-secondDigit;
    break;
    case "*" :
    sum=firstDigit*secondDigit;
    break;
    case "/" :
    sum=firstDigit/secondDigit;
    break;
    case "%" :
    sum=firstDigit%secondDigit;
    break;
    //default case
    default:
    System.out.println("operation not matched");
    break;
    
}
   System.out.println(sum);


   
   
   //Nested if
   String specification="ECE";
   Scanner sc=new Scanner(System.in);
   System.out.println("enter size");
   int age=sc.nextInt();

if(specification=="CSE")
{
    if(age<=40 && age>=30)
    {
        System.out.println("eligible for work");
    }
    else
    {
        System.out.println(" not eligible for work");
    }
}
else
{
    if(age<=35 && age>=25)
    {
        System.out.println("eligible for manager");
    }
    else
    {
        System.out.println(" not eligible for manager");
    }
} 
}
}

