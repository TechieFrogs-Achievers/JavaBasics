import java.util.regex.Matcher;
//import java.util.regex.*;  

class Practice{
    public static void main(String[] args) {
    // 
    /*String s1 = "hello";
    String s2 = "world";
    StringBuffer sb = new StringBuffer();
    //sb.append("java");

    System.out.println(s1.compareTo(s2));

    //StringBuffer sb=new StringBuffer("Hello ");  
    sb.insert(1,"Java"); //now original string is changed  
    System.out.println(sb); 
    System.out.println(s1.indexOf('l'));
    //String s3 = s1.append("java");
 
    //Scanner s = new Scanner(System.in);

    //StringBuffer sb=new StringBuffer("Hello");  
    //sb.delete(1,3);
    //System.out.println(sb);*/
    
    Pattern p = Pattern.compile(".s");//. represents single character  
    Matcher m = p.matcher("as");  
    boolean b = m.matches();  
    
    //2nd way  
    boolean b2=Pattern.compile(".s").matcher("as").matches();  
    
    //3rd way  
    boolean b3 = Pattern.matches(".s", "as");  
    
    System.out.println(b+" "+b2+" "+b3);  

    }
}

