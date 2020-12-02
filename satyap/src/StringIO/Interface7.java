package StringIO;
import Abstract.Program7;
import Interface.InterfaceClass7;

public class Interface7 extends Program7
{
    void show()
    {
        Sample3 s3=new Sample3();
        s3.display();
        InterfaceClass7 i=new Sample3();
        i.display();

    }
    public static void main(String[] args) {
        Interface7 in=new Interface7();
        in.show();
    }

}

