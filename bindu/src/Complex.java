public class Complex {
    void add(int  p,int q,int r,int s)
    {
    int realNum = p+q;
    int imagNum = r+s;
    System.out.println("the add of realNum and imagNum is:" +realNum+"+"+imagNum+"i");
    }
void difference(int p,int q,int r,int s)
{
    int realNum = p-q;
    int imagNum = r-s;
    System.out.println("the difference of realNum and imagNum is:" +realNum+"+"+imagNum+"i");
}
void product(int p,int q,int r,int s)
{
    int realNum = p*q;
    int imagNum = r*s;
    System.out.println("the product of realNum and imagNum is:" +realNum+"+"+imagNum+"i");

}

public static void main(String[] args) {
    Complex c=new Complex();
    c.add(2,3,6,7);
    c.difference(4,9,1,5);
    c.product(3,3,4,8);
}
}


