package Exceptions;

//program to show illegal arguments exception
public class IllegalArguments {
     //method accepting ilegal arguments
    public static String Path(String parent, String filename) {
        if(parent == null)
            throw new IllegalArgumentException("The parent cannot be null!");//throwing illegalargumentException
         
        if(filename == null)
            throw new IllegalArgumentException("The filename cannot be null!");//throwing illegalargumentException
         
        return parent + " " + filename;
    }
     
    public static void main(String[] args) {
        // The following command will be successfully executed.
        System.out.println(IllegalArguments.Path("dir1", "hi"));
        System.out.println();
         
        // The following command throws an IllegalArgumentException.
        System.out.println(IllegalArguments.Path(null, "hello"));
    }
}
    

