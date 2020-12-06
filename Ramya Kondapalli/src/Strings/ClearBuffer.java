package Strings;

public class ClearBuffer {
    public static void main(String[] args) {

        //creating a string using string buffer
        StringBuffer sb = new StringBuffer("Ramya");

        sb.append(" Kondapalli");//adding new string 

        sb.append(" Java"); //adding new string 

        System.out.println("Total string : " + sb);  //printing total string 

        System.out.println("total string length : " + sb.length());
        
        sb.delete(0,6); //deleting string using string index

        System.out.println("After deletion of string : " + sb); //after deletion the string is modified 

        System.out.println("First letter : " + sb.substring(0,1));  //for printing first letter of the string

        sb.delete(0,sb.length()); //deleting entire string 

        System.out.println("Final string : ");  //It will print remaining string
    }
}

