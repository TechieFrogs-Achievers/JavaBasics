package abstraction;

//abstract classs
abstract class Parent{
    abstract void message();//abstact method with no implementation
}

//subclass one  providing body to absract method messahe()
class SubclassOne extends Parent{
    public void message(){
        System.out.println("This is first subclass ");
    }
}

//subclass two providing body to absract method messahe()
class SubclassTwo extends Parent{
    public void message(){
        System.out.println("This is second subclass ");
    }
}

//main class
public class ExcersiceOne 
{
    public static void main(String[] k)
    {
        //instantiation of subclass one
        SubclassOne one=new SubclassOne();
        one.message();//calling abstact method in class one

        //instatiation of subclass two 
        SubclassTwo two=new SubclassTwo();
        two.message();//calling abstact method in class two

    }
    
}
