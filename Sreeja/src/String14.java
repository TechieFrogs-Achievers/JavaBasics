public class String14
 {
     public static void main(String[] args) 
     {
        StringBuffer sb = new StringBuffer("hello");        //creating stringbuffer

        sb.append("hai");       //adding string to the string buffer

        System.out.println("StringBuffer:"+sb);

        sb = new StringBuffer();            //creating new object

        System.out.println("New string buffer:"+sb);

        
    }
}
