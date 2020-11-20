public class InstanceVariable
 {
    byte local_variable1=120;//instance variable byte datatype
    byte local_variable2=127;//instance variable byte datatype
    int total=local_variable1+local_variable2;//instance variable int datatype
     //main method
    public static void main(String[] args) 
    {
        InstanceVariable i=new InstanceVariable();//object create for a class
        System.out.println("total value is:"+i.total);// print the total value
    }
    
}
