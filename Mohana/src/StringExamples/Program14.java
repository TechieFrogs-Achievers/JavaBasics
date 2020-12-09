package StringExamples;

public class Program14 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer();
        //appending strings to the string buffer
        sb.append("Techie");
        sb.append("Frogs");
        sb.append("  Achievres");
        sb.append(" java programming");
   
        System.out.println("original string :" +sb);
        
        sb = new StringBuffer();//creating new stringbuffer obj so the old data will move to new obj

        System.out.println("deleted string : " +sb);


        
    }
    
}
