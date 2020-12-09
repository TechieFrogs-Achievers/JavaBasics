package Strings;

public class StringsExamples14 
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hi");//object for stringbuffer
        //adding another strings for original string in string buffer
        sb.append(" this is");
        sb.append(" StringBuffer");
        sb.append(" old object");
        System.out.println(sb);
        
        sb = new StringBuffer();//creating new stringBuffer object 
        System.out.println("new object ="+sb);//its clears the old string

    }
}
