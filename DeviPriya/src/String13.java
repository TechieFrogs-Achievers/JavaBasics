public class String13 {
    public static void main(String[] args) {

        // create a string buffer
        StringBuffer str = new StringBuffer();
    
        // add string to string buffer
        str.append("Java");
        str.append(" is");
        str.append(" awesome.");
        str.insert(  1,"sweet");

        System.out.println("StringBuffer: " + str);
    
        // clear the string
        // using setLength()
        //str.setLength(0);  // it cleared the all the string
        str.setLength(4);  // it cleared the all the string after 4th position
        System.out.println("Updated StringBuffer: " + str);

        str.setLength(0);  // it cleared the all the string
    

        System.out.println("Updated StringBuffer: " + str);
      }
    
    
}
