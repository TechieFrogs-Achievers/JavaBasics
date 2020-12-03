interface Show{
    void print();
}
interface Read extends Show{
    void read();
}
class Ramya implements Show,Read {
    public void print(){
        System.out.println("print");
    }
    public void read() {
        System.out.println("read");
    }
}
class Practice{
    public static void main(String[] args) {
        Ramya t = new Ramya();
        t.print();
        t.read();
    }
}

