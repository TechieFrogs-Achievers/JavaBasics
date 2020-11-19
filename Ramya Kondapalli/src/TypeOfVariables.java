public class TypeOfVariables{
    int data = 998;  //instance variable
    static int k=100;  //static variable
    public void studentmarks()  //method
    {
        int marks = 98; //local variable
        System.out.println(marks);
    }

public static void main(String args[])
    {
        int l=10; //local variable
        System.out.println(l);
        TypeOfVariables obj = new TypeOfVariables();
        obj.studentmarks();
        System.out.println(obj.data);
        System.out.println(k);
    }
}
