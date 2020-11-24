public class InheritanceExample8 
{
    public static void main(String[] args) 
    {
       BSub b1=new BSub(5, 6,7);
       b1.show(); 
       
    }
}
class AParent
{
  int i,j;
  AParent(int a,int b)
  {
      i=a;
      j=b;
  }
  public void show()
  {
      System.out.println("i value="+i+"\n"+"j value="+j);
  }
}
class BSub extends AParent
{
    int k;
    BSub(int a,int b,int c)
    {
       super(a, b);
       k=c;
    }
        public void show()
  {
     System.out.println("i value="+i+"\n"+"j value="+j+"\n"+"k value="+k);
  }
    
}
