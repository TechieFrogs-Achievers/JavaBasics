package ExceptionsExercise;

//class to handle InstantiationException
class A
{
    int first,second;
    A(int a,int b)    //Here there is no default constructor i.e. a constructor with no arguments
    {
        first=a;            //assigning values to local variables
        second=b;
    }
}
class Example17
{
public static void main(String args[])throws InstantiationException,IllegalAccessException,ClassNotFoundException
{
Class cl=A.class;
cl.newInstance();
}
}

