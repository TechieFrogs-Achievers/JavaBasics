package StringBufferClass;

public class CapacityExample
{
   public static void main(String[] args)
   {
      StringBuffer sb = new StringBuffer();//creation of object for stringbuffer
      System.out.println(sb.capacity());//gives the capacity
      sb.ensureCapacity(20);//increase the capacity
      System.out.println(sb.capacity());
      sb.append("hey there! im in stringBuffer class");//change the capacity
      System.out.println(sb.capacity());
   } 
}
