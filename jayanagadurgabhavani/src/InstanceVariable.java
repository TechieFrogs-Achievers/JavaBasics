public class InstanceVariable {
    byte local_variable1=112;
    byte local_variable2=123;
    int total=local_variable1+local_variable2;

    public static void main(String[] args) {
        InstanceVariable i=new InstanceVariable();
        System.out.println("total value is:"+i.total);
    }
    
}
