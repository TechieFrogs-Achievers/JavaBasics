package StringExamples;

public class StringBufferEx1 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Kemisetti");//string buffer creation
        System.out.println(sb);
        //sb.append( "          ");//adding string to stringbuffer
        sb.append(" mohana ");
        System.out.println(sb);

        StringBuffer sc = new StringBuffer();//without taking input in object creation
          sc.append( "I Good Girl ");//appending string 

          sc.append( 7);//appending integer value to the string
          System.out.println(sc); 

          sc.insert(1, "am");//inserting string after index 1
          System.out.println(sc); 

          sc.replace(4, 8, "cutee");//replacing string with another string from indexs given
          System.out.println(sc); 
        
    }
    
}
