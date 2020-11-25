package InheritanceDoc;
 
class A //parent class
{
    public int i ,j ;
    public A(int i1 , int j1 )//two parameter constuctor
    {
       i = i1;
       j = j1;
    }
       //overridden method
       
     public  void  show() //method to show vaiues
     {
          System.out.println("i =" +i + "/n" +"j =" + j) ;
     } 
}

class B extends A //inheriting properties
{
    public int k ;
    public B(int i,int j ,int k )

    /*constructor having three parameters two parametres in parent 
     class  and one nwe variable  and by using super callling the variables in base  class*/
                    
    {
        super(i,j); this.k = k;
    } 
    public void show() //overidding  the same method in parent class  
    {
        System.out.println("k value is = "+k);
    }
}


public class Program8 
{
     public static void main(String[] args) 
     { 

        B b = new B(2,3, 4); //object creation

        b.show(); 
     }
}
