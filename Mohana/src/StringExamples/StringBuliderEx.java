package StringExamples;

public class StringBuliderEx 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Techie Frogs");
        sb.append(" Achievers");
        sb.append("\n");
        sb.append("mohana");
        System.out.println(sb);
        sb.delete(1,4);//it delets the characters from index 1 to 4
        System.out.println(sb);
        sb.reverse();//it reverse the whole string
        System.out.println(sb);
        

        
    }
    
}
