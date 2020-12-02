import Interface.InterfaceExample4;//import other package

class AnotherPackage implements InterfaceExample4//implements another package interface
{@override
    public void sum()//impementation of abstract method
    {
        System.out.println("this is first method in interface");
    }
    public void display()//implementation of abstract method
    {
        System.out.println("this is second method in interface");

    }
    public void show()//implementation of abstract method
    {
        System.out.println("this is third method in interface");
    }
    public static void main(String[] args) {
        AnotherPackage a = new AnotherPackage();
        a.sum();
        a.display();
        a.show();
    }
}