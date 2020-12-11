package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExcptions {
    // main method which throws filenotfound exception
    public static void main(String[] jn) throws IOException {

        //scanner class which was reading input from a file
        FileInputStream f=new FileInputStream(new File("E:\\data.txt"));
        boolean t=false;
        //read methods to read data in file
        while(t=f.read()!=-1){
         System.out.println(t);
     }}
}
