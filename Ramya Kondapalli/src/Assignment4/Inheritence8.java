package Assignment4;
class ParentClass{
int i,j;//data members
public ParentClass(int x,int y){
this.i=x;
this.j=y;
}
void show() {
    //methods to print data members 
    System.out.println(i + " " + j);
    }
}

class ChildClass extends ParentClass {
int k;

public ChildClass(int k) {
    super(6, 8);//to invoke the data members of parent class
    this.k = k; //assigning value by using this keyword
}
    //overriding method
    void show() {
        System.out.println(k);
    }
}

public class Inheritence8 {
    public static void main(String[] args) {
     ParentClass a = new ParentClass(3,4);   
     ChildClass b = new ChildClass(6);
     b.show();//calling method in child class
    }
}
