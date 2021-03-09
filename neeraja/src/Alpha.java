import java.util.regex.*;
 
class GFG {
 
    // Function to check string is alphanumeric or not
    public static boolean isAlphaNumeric(String str)
    {
        // Regex to check string is alphanumeric or not.
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }
 
        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(str);
 
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
 
    // Driver Code.
    public static void main(String args[])
    {
 
      /*  // Test Case 1:
        String str1 = "GeeksforGeeks123";
        System.out.println(
            str1 + ": "
            + isAlphaNumeric(str1));
 
        // Test Case 2:
        String str2 = "GeeksforGeeks";
        System.out.println(
            str2 + ": "
            + isAlphaNumeric(str2));
 
        // Test Case 3:
        String str3 = "GeeksforGeeks123@#";
        System.out.println(
            str3 + ": "
            + isAlphaNumeric(str3));
 
        // Test Case 4:
        String str4 = "123";
        System.out.println(
            str4 + ": "
            + isAlphaNumeric(str4));
 
        // Test Case 5:
        String str5 = "@#";
        System.out.println(
            str5 + ": "
            + isAlphaNumeric(str5));   */
    }
}
