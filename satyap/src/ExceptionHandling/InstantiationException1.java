package ExceptionHandling;
//import java.util.*;
public class InstantiationException1
{
    int first,second;
    InstantiationException1(int a,int b)
    {
        first=a;
        second=b;
    }
    public static void main(String[] args)throws InstantiationException,IllegalAccessException,ClassNotFoundException 
    {
        InstantiationException ie=new InstantiationException();
        //ie.newInstance();
    }
}
