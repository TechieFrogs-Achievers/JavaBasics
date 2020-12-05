
class Practice{
    public static void main(String[] args) {
    // 
    String s1 = "hello";
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
    //System.out.println(sb);

    }
}

