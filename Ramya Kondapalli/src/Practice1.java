class A{
    int i,j;
    A(){
        System.out.println("default constructor");
    }
} 
class B extends A{
    B(){
    }
    B(int i,int j){
        this.i= i;
        this.j= j;
    }
    void dispaly(){
        System.out.println(i);
        System.out.println(j);
    }
}
class Practice1{
public static void main(String[] args) {
    B b = new B(10,20);
    b.dispaly();
  }
}


