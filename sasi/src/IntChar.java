public class IntChar  
{
    void show(int a,char c) // method with parameters
    {
        System.out.println("number:"+a+" "+" character:"+c);
    }
    void show(char ch,int b)
    {
        System.out.println("character:"+ch+" " +"number"+b);
    }
    public static void main(String[] args)
     {
        IntChar i=new IntChar(); //objection  creation for class
        i.show(15,'s'); // method calling with object 
        i.show('A',37);
     }
    }
