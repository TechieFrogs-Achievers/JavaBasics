 class Counter {
    int i;
    public int increment()
 {
    return i;
 }   
}
 class Sub extends Counter{
    public static void main(String args[]) {
        Counter c = new Counter(); 
        c.i=3;
        System.out.println("The value of i is:" + c.i) ;
       }


}
