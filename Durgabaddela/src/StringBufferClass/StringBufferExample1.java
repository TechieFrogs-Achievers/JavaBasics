package StringBufferClass;

public class StringBufferExample1 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Hi");//buffer class with object
        //append method
        sb.append("   ");//append method to append the another string
        //System.out.println(sb);
        sb.append("Baddela");
        sb.append("   :");
        sb.append("yah its meeee.^.");//the original string is changed
        sb.append(405);
        System.out.println(sb);

        StringBuffer s1 = new StringBuffer("Durga");//Create StringBuffer object
        //insert method
        s1.insert(2,"uuuuuuuuuu");//insert method ro insert in between the string
        s1.insert(13,"ggggggg");//change the orginal string
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("heythere");//Create StringBuffer object
        //replace method
        s2.replace(3, 5, "Hi");//replace method with start index and end index change
        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("This is a String");//Create StringBuffer object
        System.out.println("Before: " + s3);//replace method
        s3.replace(10,16,"Me");//replace method
        System.out.println("After: " + s3);

        //reverse method
        s3.reverse();
        System.out.println(s3);

    
    }
}
