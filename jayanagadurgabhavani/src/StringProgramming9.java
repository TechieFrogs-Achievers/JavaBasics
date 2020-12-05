public class StringProgramming9 
{
    public static void main(String[] args) 
    {
        String string = "-566.66";
        boolean numeric = true;

        numeric = string.matches("-?\\d+(\\.\\d+)?");//(-? =allows zero or more)
                                                    //\\d+ checks the string must have at least 1 or more numbers (\\d)  
                                                    //(\\.\\d+)? allows zero or more of the given pattern   

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}
