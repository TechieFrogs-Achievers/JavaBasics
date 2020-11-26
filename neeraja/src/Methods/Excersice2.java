package Methods;


class Print
{
     //showing method overloading
    //method to print different data types
    public void printype(int i,char c){
        System.out.println("integer:"+i + " " +"charecter:"+ c);//prints first integer and then charecter
    }
    //same methd to print intechanging the data types
    public void  printype(char c,int i){
        System.out.println("charecter:"+c+" "+"integer:"+i);//prints charecter first and then integer
    }
}
public class Excersice2 
{
    public static void main(String[] args) 
    {
      //instance of print class
      Print t = new Print();
      //calling the methods by its objects
      t.printype('n', 4);
      t.printype(2, 'b');
    }
}

