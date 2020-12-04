public class String12 {
    public static void main(String[] args) {

        // create a string buffer
        StringBuffer str = new StringBuffer("sweet");
    
        // add string to string buffer
        str.append("Mango");
        str.append(" is");
        str.append(" famous");
        str.insert(  1,"sweet");

        System.out.println("StringBuffer: " + str);
        str.delete(5, str.length());//clear the string after 5th letter 
        System.out.println("Updated StringBuffer: " + str);


    
        // clear the string
        // using delete()
        str.delete(0, str.length());
        System.out.println("Updated StringBuffer: " + str);
      }
    
    
}
